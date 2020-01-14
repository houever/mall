package com.mall.pms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.pms.repository.PmsSkuImagesRepository;
import com.mall.pms.entity.PmsSkuImages;
import com.mall.pms.service.IPmsSkuImagesService;
import com.mall.pms.mapper.IPmsSkuImagesMapper;
/**
 * <p>
 * sku图片 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class PmsSkuImagesServiceImpl extends BaseServiceImpl<IPmsSkuImagesMapper,PmsSkuImages> implements IPmsSkuImagesService{

    @Resource
    private IPmsSkuImagesMapper PmsSkuImagesMapper;

}
