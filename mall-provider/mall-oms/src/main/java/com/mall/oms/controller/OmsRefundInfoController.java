package com.mall.oms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.oms.entity.OmsRefundInfo;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.oms.service.IOmsRefundInfoService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 退款信息 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"退款信息 前端控制器"})
@RestController
@RequestMapping("/oms-refund-info")
@AllArgsConstructor
public class OmsRefundInfoController extends BaseController<IOmsRefundInfoService,OmsRefundInfo,String> {

private final IOmsRefundInfoService OmsRefundInfoService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<OmsRefundInfo> getById(@PathVariable(name = "id") String id){
        return Result.success(OmsRefundInfoService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<OmsRefundInfo>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<OmsRefundInfo> page=new Page<OmsRefundInfo>(current,size);
        return Result.success(OmsRefundInfoService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody OmsRefundInfo entity){
        return Result.success(OmsRefundInfoService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody OmsRefundInfo entity){
        return Result.success(OmsRefundInfoService.updateById(entity));
    }

}
