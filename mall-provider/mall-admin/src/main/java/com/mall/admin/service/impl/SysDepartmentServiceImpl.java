package com.mall.admin.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.admin.repository.SysDepartmentRepository;
import com.mall.admin.entity.SysDepartment;
import com.mall.admin.service.ISysDepartmentService;
import com.mall.admin.mapper.ISysDepartmentMapper;
/**
 * <p>
 * 系统部门表 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SysDepartmentServiceImpl extends BaseServiceImpl<ISysDepartmentMapper,SysDepartment> implements ISysDepartmentService{

    @Resource
    private ISysDepartmentMapper SysDepartmentMapper;

}
