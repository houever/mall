package com.mall.pms.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.pms.entity.PmsAttrAttrgroupRelation;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.pms.service.IPmsAttrAttrgroupRelationService;

import java.util.List;

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
@Api(tags = {"属性&属性分组关联 前端控制器"})
@RestController
@RequestMapping("/pms-attr-attrgroup-relation")
@AllArgsConstructor
public class PmsAttrAttrgroupRelationController extends BaseController<IPmsAttrAttrgroupRelationService, PmsAttrAttrgroupRelation, String> {

    private final IPmsAttrAttrgroupRelationService PmsAttrAttrgroupRelationService;

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
