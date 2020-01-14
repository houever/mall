package com.mall.wms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.wms.entity.WmsFeightTemplate;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.wms.service.IWmsFeightTemplateService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 运费模板 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"运费模板 前端控制器"})
@RestController
@RequestMapping("/wms-feight-template")
@AllArgsConstructor
public class WmsFeightTemplateController extends BaseController<IWmsFeightTemplateService,WmsFeightTemplate,String> {

private final IWmsFeightTemplateService WmsFeightTemplateService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<WmsFeightTemplate> getById(@PathVariable(name = "id") String id){
        return Result.success(WmsFeightTemplateService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<WmsFeightTemplate>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<WmsFeightTemplate> page=new Page<WmsFeightTemplate>(current,size);
        return Result.success(WmsFeightTemplateService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody WmsFeightTemplate entity){
        return Result.success(WmsFeightTemplateService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody WmsFeightTemplate entity){
        return Result.success(WmsFeightTemplateService.updateById(entity));
    }

}
