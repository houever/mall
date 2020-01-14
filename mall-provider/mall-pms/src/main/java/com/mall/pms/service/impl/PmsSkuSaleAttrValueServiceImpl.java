package com.mall.pms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.pms.repository.PmsSkuSaleAttrValueRepository;
import com.mall.pms.entity.PmsSkuSaleAttrValue;
import com.mall.pms.service.IPmsSkuSaleAttrValueService;
import com.mall.pms.mapper.IPmsSkuSaleAttrValueMapper;
/**
 * <p>
 * sku销售属性&值 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class PmsSkuSaleAttrValueServiceImpl extends BaseServiceImpl<IPmsSkuSaleAttrValueMapper,PmsSkuSaleAttrValue> implements IPmsSkuSaleAttrValueService{

    @Resource
    private IPmsSkuSaleAttrValueMapper PmsSkuSaleAttrValueMapper;

}
