package com.mall.sms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.sms.entity.SmsSpuBounds;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.sms.service.ISmsSpuBoundsService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 商品spu积分设置 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"商品spu积分设置 前端控制器"})
@RestController
@RequestMapping("/sms-spu-bounds")
@AllArgsConstructor
public class SmsSpuBoundsController extends BaseController<ISmsSpuBoundsService,SmsSpuBounds,String> {

private final ISmsSpuBoundsService SmsSpuBoundsService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<SmsSpuBounds> getById(@PathVariable(name = "id") String id){
        return Result.success(SmsSpuBoundsService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<SmsSpuBounds>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<SmsSpuBounds> page=new Page<SmsSpuBounds>(current,size);
        return Result.success(SmsSpuBoundsService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody SmsSpuBounds entity){
        return Result.success(SmsSpuBoundsService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody SmsSpuBounds entity){
        return Result.success(SmsSpuBoundsService.updateById(entity));
    }

}
