package com.mall.pms.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import com.mall.pms.entity.PmsAttr;
import com.mall.pms.service.IPmsAttrService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.pms.entity.PmsAttrAttrgroupRelation;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.pms.service.IPmsAttrAttrgroupRelationService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 属性&属性分组关联 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Slf4j
@Api(tags = {"属性&属性分组关联 前端控制器"})
@RestController
@RequestMapping("/pms-attr-attrgroup-relation")
@AllArgsConstructor
public class PmsAttrAttrgroupRelationController extends BaseController<IPmsAttrAttrgroupRelationService, PmsAttrAttrgroupRelation, String> {

    private final IPmsAttrService PmsAttrService;
    private final IPmsAttrAttrgroupRelationService PmsAttrAttrgroupRelationService;


    /**
     * 根据id查询
     *
     * @return
     */
    @GetMapping(value = "/attrInfo/{gid}")
    @ApiOperation(value = "通过分组id查询分组关联属性信息")
    public Result attrInfo(@PathVariable(name = "gid") Integer gid) {

        List<Long> attrGroupIds = PmsAttrAttrgroupRelationService.list(queryWrapper().eq("attr_group_id", gid)).stream().map(a -> a.getAttrId()).collect(Collectors.toList());

        List<PmsAttr> list = PmsAttrService.list(Wrappers.<PmsAttr>lambdaQuery().in(PmsAttr::getAttrId, attrGroupIds));

        return Result.success(list);
    }

    /**
     * 根据id查询
     *
     * @return
     */
    @PostMapping(value = "/remove/relation")
    @ApiOperation(value = "删除分组与属性关联关系")
    public Result removeRelation(@RequestBody PmsAttrAttrgroupRelation relation) {
        boolean remove = PmsAttrAttrgroupRelationService.remove(queryWrapper().eq("attr_id", relation.getAttrId()).eq("attr_group_id", relation.getAttrGroupId()));
        return Result.success(remove);
    }


    /**
     * 根据id查询
     *
     * @return
     */
    @GetMapping(value = "/get/{id}")
    @ApiOperation(value = "通过id获取")
    public Result<PmsAttrAttrgroupRelation> getById(@PathVariable(name = "id") String id) {
        return Result.success(PmsAttrAttrgroupRelationService.getById(id));
    }

    /**
     * 分页列表
     *
     * @param current
     * @param size
     * @return
     */
    @GetMapping(value = "/page/{current}/{size}")
    @ApiOperation(value = "分页获取")
    public Result<IPage<PmsAttrAttrgroupRelation>> getByPage(@PathVariable(name = "current") Long current, @PathVariable(name = "size") Long size) {
        IPage<PmsAttrAttrgroupRelation> page = new Page<PmsAttrAttrgroupRelation>(current, size);
        return Result.success(PmsAttrAttrgroupRelationService.page(page));
    }

    /**
     * 添加数据
     *
     * @param entity
     * @return Result
     */
    @PostMapping(value = "/add")
    @ApiOperation(value = "保存数据")
    public Result save(@RequestBody PmsAttrAttrgroupRelation entity) {
        return Result.success(PmsAttrAttrgroupRelationService.save(entity));
    }

    /**
     * 修改数据
     *
     * @return
     */
    @PostMapping(value = "/modify")
    @ApiOperation(value = "更新数据")
    public Result modify(@RequestBody PmsAttrAttrgroupRelation entity) {
        return Result.success(PmsAttrAttrgroupRelationService.updateById(entity));
    }

}
