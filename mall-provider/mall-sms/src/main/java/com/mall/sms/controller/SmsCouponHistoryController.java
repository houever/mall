package com.mall.sms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.sms.entity.SmsCouponHistory;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.sms.service.ISmsCouponHistoryService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 优惠券领取历史记录 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"优惠券领取历史记录 前端控制器"})
@RestController
@RequestMapping("/sms-coupon-history")
@AllArgsConstructor
public class SmsCouponHistoryController extends BaseController<ISmsCouponHistoryService,SmsCouponHistory,String> {

private final ISmsCouponHistoryService SmsCouponHistoryService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<SmsCouponHistory> getById(@PathVariable(name = "id") String id){
        return Result.success(SmsCouponHistoryService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<SmsCouponHistory>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<SmsCouponHistory> page=new Page<SmsCouponHistory>(current,size);
        return Result.success(SmsCouponHistoryService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody SmsCouponHistory entity){
        return Result.success(SmsCouponHistoryService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody SmsCouponHistory entity){
        return Result.success(SmsCouponHistoryService.updateById(entity));
    }

}
