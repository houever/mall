package com.mall.sms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.sms.entity.SmsHomeAdv;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.sms.service.ISmsHomeAdvService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 首页轮播广告 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"首页轮播广告 前端控制器"})
@RestController
@RequestMapping("/sms-home-adv")
@AllArgsConstructor
public class SmsHomeAdvController extends BaseController<ISmsHomeAdvService,SmsHomeAdv,String> {

private final ISmsHomeAdvService SmsHomeAdvService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<SmsHomeAdv> getById(@PathVariable(name = "id") String id){
        return Result.success(SmsHomeAdvService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<SmsHomeAdv>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<SmsHomeAdv> page=new Page<SmsHomeAdv>(current,size);
        return Result.success(SmsHomeAdvService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody SmsHomeAdv entity){
        return Result.success(SmsHomeAdvService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody SmsHomeAdv entity){
        return Result.success(SmsHomeAdvService.updateById(entity));
    }

}
