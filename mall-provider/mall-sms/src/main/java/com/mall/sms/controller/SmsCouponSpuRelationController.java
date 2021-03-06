package com.mall.sms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.sms.entity.SmsCouponSpuRelation;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.sms.service.ISmsCouponSpuRelationService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 优惠券与产品关联 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"优惠券与产品关联 前端控制器"})
@RestController
@RequestMapping("/sms-coupon-spu-relation")
@AllArgsConstructor
public class SmsCouponSpuRelationController extends BaseController<ISmsCouponSpuRelationService,SmsCouponSpuRelation,String> {

private final ISmsCouponSpuRelationService SmsCouponSpuRelationService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<SmsCouponSpuRelation> getById(@PathVariable(name = "id") String id){
        return Result.success(SmsCouponSpuRelationService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<SmsCouponSpuRelation>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<SmsCouponSpuRelation> page=new Page<SmsCouponSpuRelation>(current,size);
        return Result.success(SmsCouponSpuRelationService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody SmsCouponSpuRelation entity){
        return Result.success(SmsCouponSpuRelationService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody SmsCouponSpuRelation entity){
        return Result.success(SmsCouponSpuRelationService.updateById(entity));
    }

}
