package com.mall.pms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.pms.repository.PmsProductAttrValueRepository;
import com.mall.pms.entity.PmsProductAttrValue;
import com.mall.pms.service.IPmsProductAttrValueService;
import com.mall.pms.mapper.IPmsProductAttrValueMapper;
/**
 * <p>
 * spu属性值 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class PmsProductAttrValueServiceImpl extends BaseServiceImpl<IPmsProductAttrValueMapper,PmsProductAttrValue> implements IPmsProductAttrValueService{

    @Resource
    private IPmsProductAttrValueMapper PmsProductAttrValueMapper;

}
