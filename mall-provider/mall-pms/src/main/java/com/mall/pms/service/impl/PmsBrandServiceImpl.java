package com.mall.pms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.pms.repository.PmsBrandRepository;
import com.mall.pms.entity.PmsBrand;
import com.mall.pms.service.IPmsBrandService;
import com.mall.pms.mapper.IPmsBrandMapper;
/**
 * <p>
 * 品牌 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class PmsBrandServiceImpl extends BaseServiceImpl<IPmsBrandMapper,PmsBrand> implements IPmsBrandService{

    @Resource
    private IPmsBrandMapper PmsBrandMapper;

}
