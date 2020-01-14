package com.mall.ums.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.ums.entity.UmsMemberLoginLog;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.ums.service.IUmsMemberLoginLogService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 会员登录记录 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"会员登录记录 前端控制器"})
@RestController
@RequestMapping("/ums-member-login-log")
@AllArgsConstructor
public class UmsMemberLoginLogController extends BaseController<IUmsMemberLoginLogService,UmsMemberLoginLog,String> {

private final IUmsMemberLoginLogService UmsMemberLoginLogService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<UmsMemberLoginLog> getById(@PathVariable(name = "id") String id){
        return Result.success(UmsMemberLoginLogService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<UmsMemberLoginLog>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<UmsMemberLoginLog> page=new Page<UmsMemberLoginLog>(current,size);
        return Result.success(UmsMemberLoginLogService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody UmsMemberLoginLog entity){
        return Result.success(UmsMemberLoginLogService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody UmsMemberLoginLog entity){
        return Result.success(UmsMemberLoginLogService.updateById(entity));
    }

}
