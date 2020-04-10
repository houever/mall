package com.mall.pms.controller;

import cn.fast.web.base.BaseController;
import cn.fast.web.common.result.Result;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mall.pms.entity.PmsProduct;
import com.mall.pms.service.IPmsProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 商品信息 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-04-07
 */
@Slf4j
@Api(tags = {"商品信息 前端控制器"})
@RestController
@RequestMapping("/pms-product")
@AllArgsConstructor
public class PmsProductController extends BaseController<IPmsProductService, PmsProduct, String> {

    private final IPmsProductService PmsProductService;
    private com.mall.pms.repository.PmsProductRepository PmsProductRepository;

    /**
     * 根据id查询
     *
     * @return
     */
    @GetMapping(value = "/get/{id}")
    @ApiOperation(value = "通过id获取")
    public Result<PmsProduct> getById(@PathVariable(name = "id") String id) {
        return Result.success(PmsProductService.getById(id));
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
    public Result<IPage<PmsProduct>> getByPage(@PathVariable(name = "current") Long current, @PathVariable(name = "size") Long size) {
        IPage<PmsProduct> page = new Page<PmsProduct>(current, size);
        return Result.success(PmsProductService.page(page));
    }

    /**
     * 添加数据
     *
     * @param entity
     * @return Result
     */
    @PostMapping(value = "/add")
    @ApiOperation(value = "保存数据")
    public Result save(@RequestBody PmsProduct entity) {
        return Result.success(PmsProductService.save(entity));
    }

    /**
     * 修改数据
     *
     * @return
     */
    @PostMapping(value = "/modify")
    @ApiOperation(value = "更新数据")
    public Result modify(@RequestBody PmsProduct entity) {
        return Result.success(PmsProductService.updateById(entity));
    }

}
