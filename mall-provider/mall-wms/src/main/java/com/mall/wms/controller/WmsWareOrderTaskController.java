package com.mall.wms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.wms.entity.WmsWareOrderTask;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.wms.service.IWmsWareOrderTaskService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 库存工作单 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"库存工作单 前端控制器"})
@RestController
@RequestMapping("/wms-ware-order-task")
@AllArgsConstructor
public class WmsWareOrderTaskController extends BaseController<IWmsWareOrderTaskService,WmsWareOrderTask,String> {

private final IWmsWareOrderTaskService WmsWareOrderTaskService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<WmsWareOrderTask> getById(@PathVariable(name = "id") String id){
        return Result.success(WmsWareOrderTaskService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<WmsWareOrderTask>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<WmsWareOrderTask> page=new Page<WmsWareOrderTask>(current,size);
        return Result.success(WmsWareOrderTaskService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody WmsWareOrderTask entity){
        return Result.success(WmsWareOrderTaskService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody WmsWareOrderTask entity){
        return Result.success(WmsWareOrderTaskService.updateById(entity));
    }

}
