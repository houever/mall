package com.mall.pms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.pms.entity.PmsProductAttrValue;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.pms.service.IPmsProductAttrValueService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * spu属性值 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"spu属性值 前端控制器"})
@RestController
@RequestMapping("/pms-product-attr-value")
@AllArgsConstructor
public class PmsProductAttrValueController extends BaseController<IPmsProductAttrValueService,PmsProductAttrValue,String> {

private final IPmsProductAttrValueService PmsProductAttrValueService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<PmsProductAttrValue> getById(@PathVariable(name = "id") String id){
        return Result.success(PmsProductAttrValueService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<PmsProductAttrValue>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<PmsProductAttrValue> page=new Page<PmsProductAttrValue>(current,size);
        return Result.success(PmsProductAttrValueService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody PmsProductAttrValue entity){
        return Result.success(PmsProductAttrValueService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody PmsProductAttrValue entity){
        return Result.success(PmsProductAttrValueService.updateById(entity));
    }

}
