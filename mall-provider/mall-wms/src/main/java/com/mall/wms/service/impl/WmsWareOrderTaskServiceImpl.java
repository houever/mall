package com.mall.wms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.wms.repository.WmsWareOrderTaskRepository;
import com.mall.wms.entity.WmsWareOrderTask;
import com.mall.wms.service.IWmsWareOrderTaskService;
import com.mall.wms.mapper.IWmsWareOrderTaskMapper;
/**
 * <p>
 * 库存工作单 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class WmsWareOrderTaskServiceImpl extends BaseServiceImpl<IWmsWareOrderTaskMapper,WmsWareOrderTask> implements IWmsWareOrderTaskService{

    @Resource
    private IWmsWareOrderTaskMapper WmsWareOrderTaskMapper;

}
