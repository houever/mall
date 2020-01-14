package com.mall.pms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.pms.repository.PmsSkuInfoRepository;
import com.mall.pms.entity.PmsSkuInfo;
import com.mall.pms.service.IPmsSkuInfoService;
import com.mall.pms.mapper.IPmsSkuInfoMapper;
/**
 * <p>
 * sku信息 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class PmsSkuInfoServiceImpl extends BaseServiceImpl<IPmsSkuInfoMapper,PmsSkuInfo> implements IPmsSkuInfoService{

    @Resource
    private IPmsSkuInfoMapper PmsSkuInfoMapper;

}
