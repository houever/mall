package com.mall.wms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.wms.entity.WmsWareInfo;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.wms.service.IWmsWareInfoService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 仓库信息 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"仓库信息 前端控制器"})
@RestController
@RequestMapping("/wms-ware-info")
@AllArgsConstructor
public class WmsWareInfoController extends BaseController<IWmsWareInfoService,WmsWareInfo,String> {

private final IWmsWareInfoService WmsWareInfoService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<WmsWareInfo> getById(@PathVariable(name = "id") String id){
        return Result.success(WmsWareInfoService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<WmsWareInfo>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<WmsWareInfo> page=new Page<WmsWareInfo>(current,size);
        return Result.success(WmsWareInfoService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody WmsWareInfo entity){
        return Result.success(WmsWareInfoService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody WmsWareInfo entity){
        return Result.success(WmsWareInfoService.updateById(entity));
    }

}
