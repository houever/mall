package com.mall.wms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.wms.repository.WmsWareInfoRepository;
import com.mall.wms.entity.WmsWareInfo;
import com.mall.wms.service.IWmsWareInfoService;
import com.mall.wms.mapper.IWmsWareInfoMapper;
/**
 * <p>
 * 仓库信息 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class WmsWareInfoServiceImpl extends BaseServiceImpl<IWmsWareInfoMapper,WmsWareInfo> implements IWmsWareInfoService{

    @Resource
    private IWmsWareInfoMapper WmsWareInfoMapper;

}
