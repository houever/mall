package com.mall.sms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.sms.entity.SmsSeckillSkuNotice;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.sms.service.ISmsSeckillSkuNoticeService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 秒杀商品通知订阅 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"秒杀商品通知订阅 前端控制器"})
@RestController
@RequestMapping("/sms-seckill-sku-notice")
@AllArgsConstructor
public class SmsSeckillSkuNoticeController extends BaseController<ISmsSeckillSkuNoticeService,SmsSeckillSkuNotice,String> {

private final ISmsSeckillSkuNoticeService SmsSeckillSkuNoticeService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<SmsSeckillSkuNotice> getById(@PathVariable(name = "id") String id){
        return Result.success(SmsSeckillSkuNoticeService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<SmsSeckillSkuNotice>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<SmsSeckillSkuNotice> page=new Page<SmsSeckillSkuNotice>(current,size);
        return Result.success(SmsSeckillSkuNoticeService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody SmsSeckillSkuNotice entity){
        return Result.success(SmsSeckillSkuNoticeService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody SmsSeckillSkuNotice entity){
        return Result.success(SmsSeckillSkuNoticeService.updateById(entity));
    }

}
