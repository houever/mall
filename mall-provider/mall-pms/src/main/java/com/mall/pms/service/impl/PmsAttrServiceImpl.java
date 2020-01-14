package com.mall.pms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.pms.repository.PmsAttrRepository;
import com.mall.pms.entity.PmsAttr;
import com.mall.pms.service.IPmsAttrService;
import com.mall.pms.mapper.IPmsAttrMapper;
/**
 * <p>
 * 商品属性 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class PmsAttrServiceImpl extends BaseServiceImpl<IPmsAttrMapper,PmsAttr> implements IPmsAttrService{

    @Resource
    private IPmsAttrMapper PmsAttrMapper;

}
