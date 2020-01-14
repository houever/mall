package com.mall.oms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.oms.entity.OmsOrderReturnApply;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.oms.service.IOmsOrderReturnApplyService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 订单退货申请 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"订单退货申请 前端控制器"})
@RestController
@RequestMapping("/oms-order-return-apply")
@AllArgsConstructor
public class OmsOrderReturnApplyController extends BaseController<IOmsOrderReturnApplyService,OmsOrderReturnApply,String> {

private final IOmsOrderReturnApplyService OmsOrderReturnApplyService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<OmsOrderReturnApply> getById(@PathVariable(name = "id") String id){
        return Result.success(OmsOrderReturnApplyService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<OmsOrderReturnApply>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<OmsOrderReturnApply> page=new Page<OmsOrderReturnApply>(current,size);
        return Result.success(OmsOrderReturnApplyService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody OmsOrderReturnApply entity){
        return Result.success(OmsOrderReturnApplyService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody OmsOrderReturnApply entity){
        return Result.success(OmsOrderReturnApplyService.updateById(entity));
    }

}
