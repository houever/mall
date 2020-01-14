package com.mall.ums.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.ums.entity.UmsIntegrationChangeHistory;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.ums.service.IUmsIntegrationChangeHistoryService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 积分变化历史记录 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"积分变化历史记录 前端控制器"})
@RestController
@RequestMapping("/ums-integration-change-history")
@AllArgsConstructor
public class UmsIntegrationChangeHistoryController extends BaseController<IUmsIntegrationChangeHistoryService,UmsIntegrationChangeHistory,String> {

private final IUmsIntegrationChangeHistoryService UmsIntegrationChangeHistoryService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<UmsIntegrationChangeHistory> getById(@PathVariable(name = "id") String id){
        return Result.success(UmsIntegrationChangeHistoryService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<UmsIntegrationChangeHistory>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<UmsIntegrationChangeHistory> page=new Page<UmsIntegrationChangeHistory>(current,size);
        return Result.success(UmsIntegrationChangeHistoryService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody UmsIntegrationChangeHistory entity){
        return Result.success(UmsIntegrationChangeHistoryService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody UmsIntegrationChangeHistory entity){
        return Result.success(UmsIntegrationChangeHistoryService.updateById(entity));
    }

}
