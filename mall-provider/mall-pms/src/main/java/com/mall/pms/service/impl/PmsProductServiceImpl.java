package com.mall.pms.service.impl;

import cn.fast.web.base.BaseServiceImpl;
import com.mall.pms.entity.PmsProduct;
import com.mall.pms.mapper.IPmsProductMapper;
import com.mall.pms.repository.PmsProductRepository;
import com.mall.pms.service.IPmsProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-02-17
 */
@Slf4j
@Service
@AllArgsConstructor
public class PmsProductServiceImpl extends BaseServiceImpl<IPmsProductMapper,PmsProduct> implements IPmsProductService{

    private IPmsProductMapper PmsProductMapper;
    private PmsProductRepository PmsProductRepository;

}
