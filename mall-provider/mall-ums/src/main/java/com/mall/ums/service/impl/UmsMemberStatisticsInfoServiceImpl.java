package com.mall.ums.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.ums.repository.UmsMemberStatisticsInfoRepository;
import com.mall.ums.entity.UmsMemberStatisticsInfo;
import com.mall.ums.service.IUmsMemberStatisticsInfoService;
import com.mall.ums.mapper.IUmsMemberStatisticsInfoMapper;
/**
 * <p>
 * 会员统计信息 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class UmsMemberStatisticsInfoServiceImpl extends BaseServiceImpl<IUmsMemberStatisticsInfoMapper,UmsMemberStatisticsInfo> implements IUmsMemberStatisticsInfoService{

    @Resource
    private IUmsMemberStatisticsInfoMapper UmsMemberStatisticsInfoMapper;

}
