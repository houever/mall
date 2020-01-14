package com.mall.admin.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.admin.repository.SysDictDataRepository;
import com.mall.admin.entity.SysDictData;
import com.mall.admin.service.ISysDictDataService;
import com.mall.admin.mapper.ISysDictDataMapper;
/**
 * <p>
 * 系统分类数据表 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SysDictDataServiceImpl extends BaseServiceImpl<ISysDictDataMapper,SysDictData> implements ISysDictDataService{

    @Resource
    private ISysDictDataMapper SysDictDataMapper;

}
