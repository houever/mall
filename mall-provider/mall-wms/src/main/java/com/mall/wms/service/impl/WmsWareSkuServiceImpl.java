package com.mall.wms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.wms.repository.WmsWareSkuRepository;
import com.mall.wms.entity.WmsWareSku;
import com.mall.wms.service.IWmsWareSkuService;
import com.mall.wms.mapper.IWmsWareSkuMapper;
/**
 * <p>
 * 商品库存 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class WmsWareSkuServiceImpl extends BaseServiceImpl<IWmsWareSkuMapper,WmsWareSku> implements IWmsWareSkuService{

    @Resource
    private IWmsWareSkuMapper WmsWareSkuMapper;

}
