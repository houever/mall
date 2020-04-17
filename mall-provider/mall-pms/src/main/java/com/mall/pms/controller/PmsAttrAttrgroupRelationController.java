package com.mall.pms.controller;

import cn.fast.web.base.BaseController;
import cn.fast.web.common.result.Result;
import cn.fast.web.utils.ObjectConvertUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.common.collect.Lists;
import com.mall.pms.entity.PmsAttr;
import com.mall.pms.entity.PmsAttrAttrgroupRelation;
import com.mall.pms.model.AttrDTO;
import com.mall.pms.service.IPmsAttrAttrgroupRelationService;
import com.mall.pms.service.IPmsAttrService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
        QueryWrapper<PmsAttrAttrgroupRelation> wrapper = Wrappers.emptyWrapper();
        List<PmsAttrAttrgroupRelation> relations = PmsAttrAttrgroupRelationService.list(wrapper.eq("attr_group_id", gid));
        List<PmsAttr> list = Lists.newArrayList();
        if (!relations.isEmpty()) {
            List<Long> attrGroupIds = relations.stream().map(a -> a.getAttrId()).collect(Collectors.toList());
            list = PmsAttrService.list(Wrappers.<PmsAttr>lambdaQuery().in(PmsAttr::getAttrId, attrGroupIds));
        }
        return Result.success(list);
    }

    @PostMapping(value = "/addAttr")
    @ApiOperation(value = "新增分组下关联属性")
    public Result addAttr(@RequestBody AttrDTO attrDTO){
        PmsAttr pmsAttr = ObjectConvertUtil.convert(attrDTO,PmsAttr.class);
        log.info("新增分组下关联属性==>{}",pmsAttr);
        PmsAttrService.save(pmsAttr);
        pmsAttr = PmsAttrService.selectById(pmsAttr.getId());
        PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation = new PmsAttrAttrgroupRelation();
        pmsAttrAttrgroupRelation
                .setAttrId(pmsAttr.getAttrId())
                .setAttrGroupId(attrDTO.getAttrGroupId())
                .setAttrSort(0);
        boolean save = PmsAttrAttrgroupRelationService.save(pmsAttrAttrgroupRelation);
        return Result.success(save);
    }
    /**
     * 根据id查询
     *
     * @return
     */
    @PostMapping(value = "/remove/relation")
    @ApiOperation(value = "删除分组与属性关联关系")
    public Result removeRelation(@RequestBody PmsAttrAttrgroupRelation relation) {
        QueryWrapper<PmsAttrAttrgroupRelation> queryWrapper = Wrappers.emptyWrapper();
        boolean remove = PmsAttrAttrgroupRelationService.remove(queryWrapper.eq("attr_id", relation.getAttrId()).eq("attr_group_id", relation.getAttrGroupId()));
        QueryWrapper<PmsAttr> wrapper = new QueryWrapper<PmsAttr>();
        remove = PmsAttrService.remove(wrapper.eq("attr_id", relation.getAttrId()));
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
