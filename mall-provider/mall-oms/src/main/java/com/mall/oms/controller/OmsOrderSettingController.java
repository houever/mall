package com.mall.oms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.oms.entity.OmsOrderSetting;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.oms.service.IOmsOrderSettingService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 订单配置信息 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"订单配置信息 前端控制器"})
@RestController
@RequestMapping("/oms-order-setting")
@AllArgsConstructor
public class OmsOrderSettingController extends BaseController<IOmsOrderSettingService,OmsOrderSetting,String> {

private final IOmsOrderSettingService OmsOrderSettingService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<OmsOrderSetting> getById(@PathVariable(name = "id") String id){
        return Result.success(OmsOrderSettingService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<OmsOrderSetting>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<OmsOrderSetting> page=new Page<OmsOrderSetting>(current,size);
        return Result.success(OmsOrderSettingService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody OmsOrderSetting entity){
        return Result.success(OmsOrderSettingService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody OmsOrderSetting entity){
        return Result.success(OmsOrderSettingService.updateById(entity));
    }

}
