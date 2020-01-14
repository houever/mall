package com.mall.pms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.pms.entity.PmsSkuSaleAttrValue;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.pms.service.IPmsSkuSaleAttrValueService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * sku销售属性&值 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"sku销售属性&值 前端控制器"})
@RestController
@RequestMapping("/pms-sku-sale-attr-value")
@AllArgsConstructor
public class PmsSkuSaleAttrValueController extends BaseController<IPmsSkuSaleAttrValueService,PmsSkuSaleAttrValue,String> {

private final IPmsSkuSaleAttrValueService PmsSkuSaleAttrValueService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<PmsSkuSaleAttrValue> getById(@PathVariable(name = "id") String id){
        return Result.success(PmsSkuSaleAttrValueService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<PmsSkuSaleAttrValue>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<PmsSkuSaleAttrValue> page=new Page<PmsSkuSaleAttrValue>(current,size);
        return Result.success(PmsSkuSaleAttrValueService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody PmsSkuSaleAttrValue entity){
        return Result.success(PmsSkuSaleAttrValueService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody PmsSkuSaleAttrValue entity){
        return Result.success(PmsSkuSaleAttrValueService.updateById(entity));
    }

}
