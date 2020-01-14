package com.mall.pms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.pms.repository.PmsSpuInfoRepository;
import com.mall.pms.entity.PmsSpuInfo;
import com.mall.pms.service.IPmsSpuInfoService;
import com.mall.pms.mapper.IPmsSpuInfoMapper;
/**
 * <p>
 * spu信息 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class PmsSpuInfoServiceImpl extends BaseServiceImpl<IPmsSpuInfoMapper,PmsSpuInfo> implements IPmsSpuInfoService{

    @Resource
    private IPmsSpuInfoMapper PmsSpuInfoMapper;

}
