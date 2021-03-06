package com.mall.sms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.sms.entity.SmsCategoryBounds;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.sms.service.ISmsCategoryBoundsService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 商品分类积分设置 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"商品分类积分设置 前端控制器"})
@RestController
@RequestMapping("/sms-category-bounds")
@AllArgsConstructor
public class SmsCategoryBoundsController extends BaseController<ISmsCategoryBoundsService,SmsCategoryBounds,String> {

private final ISmsCategoryBoundsService SmsCategoryBoundsService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<SmsCategoryBounds> getById(@PathVariable(name = "id") String id){
        return Result.success(SmsCategoryBoundsService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<SmsCategoryBounds>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<SmsCategoryBounds> page=new Page<SmsCategoryBounds>(current,size);
        return Result.success(SmsCategoryBoundsService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody SmsCategoryBounds entity){
        return Result.success(SmsCategoryBoundsService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody SmsCategoryBounds entity){
        return Result.success(SmsCategoryBoundsService.updateById(entity));
    }

}
