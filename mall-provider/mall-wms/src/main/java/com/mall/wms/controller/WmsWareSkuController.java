package com.mall.wms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.wms.entity.WmsWareSku;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.wms.service.IWmsWareSkuService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 商品库存 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"商品库存 前端控制器"})
@RestController
@RequestMapping("/wms-ware-sku")
@AllArgsConstructor
public class WmsWareSkuController extends BaseController<IWmsWareSkuService,WmsWareSku,String> {

private final IWmsWareSkuService WmsWareSkuService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<WmsWareSku> getById(@PathVariable(name = "id") String id){
        return Result.success(WmsWareSkuService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<WmsWareSku>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<WmsWareSku> page=new Page<WmsWareSku>(current,size);
        return Result.success(WmsWareSkuService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody WmsWareSku entity){
        return Result.success(WmsWareSkuService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody WmsWareSku entity){
        return Result.success(WmsWareSkuService.updateById(entity));
    }

}
