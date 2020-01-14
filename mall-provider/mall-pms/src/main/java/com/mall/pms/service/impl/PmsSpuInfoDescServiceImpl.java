package com.mall.pms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.pms.repository.PmsSpuInfoDescRepository;
import com.mall.pms.entity.PmsSpuInfoDesc;
import com.mall.pms.service.IPmsSpuInfoDescService;
import com.mall.pms.mapper.IPmsSpuInfoDescMapper;
/**
 * <p>
 * spu信息介绍 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class PmsSpuInfoDescServiceImpl extends BaseServiceImpl<IPmsSpuInfoDescMapper,PmsSpuInfoDesc> implements IPmsSpuInfoDescService{

    @Resource
    private IPmsSpuInfoDescMapper PmsSpuInfoDescMapper;

}
