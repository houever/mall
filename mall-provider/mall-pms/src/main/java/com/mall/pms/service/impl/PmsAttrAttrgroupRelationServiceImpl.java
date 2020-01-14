package com.mall.pms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.pms.repository.PmsAttrAttrgroupRelationRepository;
import com.mall.pms.entity.PmsAttrAttrgroupRelation;
import com.mall.pms.service.IPmsAttrAttrgroupRelationService;
import com.mall.pms.mapper.IPmsAttrAttrgroupRelationMapper;
/**
 * <p>
 * 属性&属性分组关联 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class PmsAttrAttrgroupRelationServiceImpl extends BaseServiceImpl<IPmsAttrAttrgroupRelationMapper,PmsAttrAttrgroupRelation> implements IPmsAttrAttrgroupRelationService{

    @Resource
    private IPmsAttrAttrgroupRelationMapper PmsAttrAttrgroupRelationMapper;

}
