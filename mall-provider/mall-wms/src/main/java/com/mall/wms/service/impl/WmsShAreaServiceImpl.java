package com.mall.wms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.wms.repository.WmsShAreaRepository;
import com.mall.wms.entity.WmsShArea;
import com.mall.wms.service.IWmsShAreaService;
import com.mall.wms.mapper.IWmsShAreaMapper;
/**
 * <p>
 * 全国省市区信息 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class WmsShAreaServiceImpl extends BaseServiceImpl<IWmsShAreaMapper,WmsShArea> implements IWmsShAreaService{

    @Resource
    private IWmsShAreaMapper WmsShAreaMapper;

}
