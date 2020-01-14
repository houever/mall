package com.mall.oms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.oms.entity.OmsOrderReturnReason;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.oms.service.IOmsOrderReturnReasonService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 退货原因 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"退货原因 前端控制器"})
@RestController
@RequestMapping("/oms-order-return-reason")
@AllArgsConstructor
public class OmsOrderReturnReasonController extends BaseController<IOmsOrderReturnReasonService,OmsOrderReturnReason,String> {

private final IOmsOrderReturnReasonService OmsOrderReturnReasonService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<OmsOrderReturnReason> getById(@PathVariable(name = "id") String id){
        return Result.success(OmsOrderReturnReasonService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<OmsOrderReturnReason>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<OmsOrderReturnReason> page=new Page<OmsOrderReturnReason>(current,size);
        return Result.success(OmsOrderReturnReasonService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody OmsOrderReturnReason entity){
        return Result.success(OmsOrderReturnReasonService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody OmsOrderReturnReason entity){
        return Result.success(OmsOrderReturnReasonService.updateById(entity));
    }

}
