package com.mall.ums.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.ums.repository.UmsIntegrationChangeHistoryRepository;
import com.mall.ums.entity.UmsIntegrationChangeHistory;
import com.mall.ums.service.IUmsIntegrationChangeHistoryService;
import com.mall.ums.mapper.IUmsIntegrationChangeHistoryMapper;
/**
 * <p>
 * 积分变化历史记录 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class UmsIntegrationChangeHistoryServiceImpl extends BaseServiceImpl<IUmsIntegrationChangeHistoryMapper,UmsIntegrationChangeHistory> implements IUmsIntegrationChangeHistoryService{

    @Resource
    private IUmsIntegrationChangeHistoryMapper UmsIntegrationChangeHistoryMapper;

}
