package com.mall.pms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.pms.repository.PmsAttrGroupRepository;
import com.mall.pms.entity.PmsAttrGroup;
import com.mall.pms.service.IPmsAttrGroupService;
import com.mall.pms.mapper.IPmsAttrGroupMapper;
/**
 * <p>
 * 属性分组 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class PmsAttrGroupServiceImpl extends BaseServiceImpl<IPmsAttrGroupMapper,PmsAttrGroup> implements IPmsAttrGroupService{

    @Resource
    private IPmsAttrGroupMapper PmsAttrGroupMapper;

}
