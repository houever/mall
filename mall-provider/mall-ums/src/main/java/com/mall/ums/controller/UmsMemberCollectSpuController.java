package com.mall.ums.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fast.web.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.ums.entity.UmsMemberCollectSpu;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mall.ums.service.IUmsMemberCollectSpuService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import cn.fast.web.base.BaseController;

/**
 * <p>
 * 会员收藏的商品 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Api(tags={"会员收藏的商品 前端控制器"})
@RestController
@RequestMapping("/ums-member-collect-spu")
@AllArgsConstructor
public class UmsMemberCollectSpuController extends BaseController<IUmsMemberCollectSpuService,UmsMemberCollectSpu,String> {

private final IUmsMemberCollectSpuService UmsMemberCollectSpuService;

/**
  * 根据id查询
  * @return
  */
@GetMapping(value = "/get/{id}")
@ApiOperation(value = "通过id获取")
public Result<UmsMemberCollectSpu> getById(@PathVariable(name = "id") String id){
        return Result.success(UmsMemberCollectSpuService.getById(id));
    }

/**
  * 分页列表
  * @return
  * @param current
  * @param size
  */
@GetMapping(value = "/page/{current}/{size}")
@ApiOperation(value = "分页获取")
public Result<IPage<UmsMemberCollectSpu>>getByPage(@PathVariable(name = "current")Long current,@PathVariable(name = "size")Long size){
        IPage<UmsMemberCollectSpu> page=new Page<UmsMemberCollectSpu>(current,size);
        return Result.success(UmsMemberCollectSpuService.page(page));
    }
/**
  * 添加数据
  * @param entity
  * @return Result
  */
@PostMapping(value = "/add")
@ApiOperation(value = "保存数据")
public Result save(@RequestBody UmsMemberCollectSpu entity){
        return Result.success(UmsMemberCollectSpuService.save(entity));
    }
/**
  * 修改数据
  * @return
  */
@PostMapping(value = "/modify")
@ApiOperation(value = "更新数据")
public Result modify(@RequestBody UmsMemberCollectSpu entity){
        return Result.success(UmsMemberCollectSpuService.updateById(entity));
    }

}
