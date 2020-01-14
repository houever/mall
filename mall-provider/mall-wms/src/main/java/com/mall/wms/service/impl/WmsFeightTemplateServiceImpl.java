package com.mall.wms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.wms.repository.WmsFeightTemplateRepository;
import com.mall.wms.entity.WmsFeightTemplate;
import com.mall.wms.service.IWmsFeightTemplateService;
import com.mall.wms.mapper.IWmsFeightTemplateMapper;
/**
 * <p>
 * 运费模板 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class WmsFeightTemplateServiceImpl extends BaseServiceImpl<IWmsFeightTemplateMapper,WmsFeightTemplate> implements IWmsFeightTemplateService{

    @Resource
    private IWmsFeightTemplateMapper WmsFeightTemplateMapper;

}
