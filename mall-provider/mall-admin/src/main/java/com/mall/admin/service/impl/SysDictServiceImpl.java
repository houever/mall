package com.mall.admin.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.admin.repository.SysDictRepository;
import com.mall.admin.entity.SysDict;
import com.mall.admin.service.ISysDictService;
import com.mall.admin.mapper.ISysDictMapper;
/**
 * <p>
 * 系统字典分类表 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SysDictServiceImpl extends BaseServiceImpl<ISysDictMapper,SysDict> implements ISysDictService{

    @Resource
    private ISysDictMapper SysDictMapper;

}
