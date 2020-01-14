package com.mall.oms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.oms.repository.OmsOrderSettingRepository;
import com.mall.oms.entity.OmsOrderSetting;
import com.mall.oms.service.IOmsOrderSettingService;
import com.mall.oms.mapper.IOmsOrderSettingMapper;
/**
 * <p>
 * 订单配置信息 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class OmsOrderSettingServiceImpl extends BaseServiceImpl<IOmsOrderSettingMapper,OmsOrderSetting> implements IOmsOrderSettingService{

    @Resource
    private IOmsOrderSettingMapper OmsOrderSettingMapper;

}
