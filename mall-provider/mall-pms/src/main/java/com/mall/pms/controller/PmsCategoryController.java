package com.mall.pms.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import com.mall.pms.model.CatagoryDTO;
import com.mall.pms.utils.CatagoryTreeUtil;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.pms.entity.PmsCategory;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.pms.service.IPmsCategoryService;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 商品三级分类 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags = {"商品三级分类 前端控制器"})
@RestController
@RequestMapping("/pms-category")
@AllArgsConstructor
public class PmsCategoryController extends BaseController<IPmsCategoryService, PmsCategory, String> {

    private final IPmsCategoryService PmsCategoryService;

    /**
     * 根据id查询
     *
     * @return
     */
    @GetMapping(value = "/tree")
    @ApiOperation(value = "通过id获取")
    public Result tree() {
        List<PmsCategory> all = PmsCategoryService.findAll();
        CatagoryTreeUtil catagoryTreeUtil = new CatagoryTreeUtil();
        List<CatagoryDTO> catagoryDTOS = catagoryTreeUtil.catagoryTree(all);
        return Result.success(catagoryDTOS);
    }


    /**
     * 根据id查询
     *
     * @return
     */
    @GetMapping(value = "/get/{id}")
    @ApiOperation(value = "通过id获取")
    public Result<PmsCategory> getById(@PathVariable(name = "id") String id) {
        return Result.success(PmsCategoryService.getById(id));
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
    public Result<IPage<PmsCategory>> getByPage(@PathVariable(name = "current") Long current, @PathVariable(name = "size") Long size) {
        IPage<PmsCategory> page = new Page<PmsCategory>(current, size);
        return Result.success(PmsCategoryService.page(page));
    }

    /**
     * 添加数据
     *
     * @param entity
     * @return Result
     */
    @PostMapping(value = "/add")
    @ApiOperation(value = "保存数据")
    public Result save(@RequestBody PmsCategory entity) {
        return Result.success(PmsCategoryService.save(entity));
    }

    /**
     * 修改数据
     *
     * @return
     */
    @PostMapping(value = "/modify")
    @ApiOperation(value = "更新数据")
    public Result modify(@RequestBody PmsCategory entity) {
        return Result.success(PmsCategoryService.updateById(entity));
    }

}
