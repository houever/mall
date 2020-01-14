package com.mall.sms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.sms.entity.SmsHomeSubject;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.sms.service.ISmsHomeSubjectService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 前端控制器"})
@RestController
@RequestMapping("/sms-home-subject")
@AllArgsConstructor
public class SmsHomeSubjectController extends BaseController<ISmsHomeSubjectService,SmsHomeSubject,String> {

private final ISmsHomeSubjectService SmsHomeSubjectService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<SmsHomeSubject> getById(@PathVariable(name = "id") String id){
        return Result.success(SmsHomeSubjectService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<SmsHomeSubject>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<SmsHomeSubject> page=new Page<SmsHomeSubject>(current,size);
        return Result.success(SmsHomeSubjectService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody SmsHomeSubject entity){
        return Result.success(SmsHomeSubjectService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody SmsHomeSubject entity){
        return Result.success(SmsHomeSubjectService.updateById(entity));
    }

}
