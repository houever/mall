package com.mall.ums.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.ums.repository.UmsGrowthChangeHistoryRepository;
import com.mall.ums.entity.UmsGrowthChangeHistory;
import com.mall.ums.service.IUmsGrowthChangeHistoryService;
import com.mall.ums.mapper.IUmsGrowthChangeHistoryMapper;
/**
 * <p>
 * 成长值变化历史记录 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class UmsGrowthChangeHistoryServiceImpl extends BaseServiceImpl<IUmsGrowthChangeHistoryMapper,UmsGrowthChangeHistory> implements IUmsGrowthChangeHistoryService{

    @Resource
    private IUmsGrowthChangeHistoryMapper UmsGrowthChangeHistoryMapper;

}
