package com.mall.sms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.sms.entity.SmsHomeSubjectSpu;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.sms.service.ISmsHomeSubjectSpuService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 专题商品 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"专题商品 前端控制器"})
@RestController
@RequestMapping("/sms-home-subject-spu")
@AllArgsConstructor
public class SmsHomeSubjectSpuController extends BaseController<ISmsHomeSubjectSpuService,SmsHomeSubjectSpu,String> {

private final ISmsHomeSubjectSpuService SmsHomeSubjectSpuService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<SmsHomeSubjectSpu> getById(@PathVariable(name = "id") String id){
        return Result.success(SmsHomeSubjectSpuService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<SmsHomeSubjectSpu>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<SmsHomeSubjectSpu> page=new Page<SmsHomeSubjectSpu>(current,size);
        return Result.success(SmsHomeSubjectSpuService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody SmsHomeSubjectSpu entity){
        return Result.success(SmsHomeSubjectSpuService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody SmsHomeSubjectSpu entity){
        return Result.success(SmsHomeSubjectSpuService.updateById(entity));
    }

}
