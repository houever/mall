package com.mall.wms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.wms.repository.WmsWareOrderTaskDetailRepository;
import com.mall.wms.entity.WmsWareOrderTaskDetail;
import com.mall.wms.service.IWmsWareOrderTaskDetailService;
import com.mall.wms.mapper.IWmsWareOrderTaskDetailMapper;
/**
 * <p>
 * 库存工作单 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class WmsWareOrderTaskDetailServiceImpl extends BaseServiceImpl<IWmsWareOrderTaskDetailMapper,WmsWareOrderTaskDetail> implements IWmsWareOrderTaskDetailService{

    @Resource
    private IWmsWareOrderTaskDetailMapper WmsWareOrderTaskDetailMapper;

}
