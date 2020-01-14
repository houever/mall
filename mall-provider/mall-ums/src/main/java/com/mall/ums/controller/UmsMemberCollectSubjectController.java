package com.mall.ums.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.ums.entity.UmsMemberCollectSubject;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.ums.service.IUmsMemberCollectSubjectService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 会员收藏的专题活动 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"会员收藏的专题活动 前端控制器"})
@RestController
@RequestMapping("/ums-member-collect-subject")
@AllArgsConstructor
public class UmsMemberCollectSubjectController extends BaseController<IUmsMemberCollectSubjectService,UmsMemberCollectSubject,String> {

private final IUmsMemberCollectSubjectService UmsMemberCollectSubjectService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<UmsMemberCollectSubject> getById(@PathVariable(name = "id") String id){
        return Result.success(UmsMemberCollectSubjectService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<UmsMemberCollectSubject>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<UmsMemberCollectSubject> page=new Page<UmsMemberCollectSubject>(current,size);
        return Result.success(UmsMemberCollectSubjectService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody UmsMemberCollectSubject entity){
        return Result.success(UmsMemberCollectSubjectService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody UmsMemberCollectSubject entity){
        return Result.success(UmsMemberCollectSubjectService.updateById(entity));
    }

}
