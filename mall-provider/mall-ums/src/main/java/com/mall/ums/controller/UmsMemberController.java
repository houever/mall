package com.mall.ums.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.ums.entity.UmsMember;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.ums.service.IUmsMemberService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 会员 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"会员 前端控制器"})
@RestController
@RequestMapping("/ums-member")
@AllArgsConstructor
public class UmsMemberController extends BaseController<IUmsMemberService,UmsMember,String> {

private final IUmsMemberService UmsMemberService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<UmsMember> getById(@PathVariable(name = "id") String id){
        return Result.success(UmsMemberService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<UmsMember>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<UmsMember> page=new Page<UmsMember>(current,size);
        return Result.success(UmsMemberService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody UmsMember entity){
        return Result.success(UmsMemberService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody UmsMember entity){
        return Result.success(UmsMemberService.updateById(entity));
    }

}
