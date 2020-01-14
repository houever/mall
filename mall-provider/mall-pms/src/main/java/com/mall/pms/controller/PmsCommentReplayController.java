package com.mall.pms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.pms.entity.PmsCommentReplay;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.pms.service.IPmsCommentReplayService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 商品评价回复关系 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"商品评价回复关系 前端控制器"})
@RestController
@RequestMapping("/pms-comment-replay")
@AllArgsConstructor
public class PmsCommentReplayController extends BaseController<IPmsCommentReplayService,PmsCommentReplay,String> {

private final IPmsCommentReplayService PmsCommentReplayService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<PmsCommentReplay> getById(@PathVariable(name = "id") String id){
        return Result.success(PmsCommentReplayService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<PmsCommentReplay>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<PmsCommentReplay> page=new Page<PmsCommentReplay>(current,size);
        return Result.success(PmsCommentReplayService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody PmsCommentReplay entity){
        return Result.success(PmsCommentReplayService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody PmsCommentReplay entity){
        return Result.success(PmsCommentReplayService.updateById(entity));
    }

}
