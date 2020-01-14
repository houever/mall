package com.mall.pms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.pms.repository.PmsCategoryRepository;
import com.mall.pms.entity.PmsCategory;
import com.mall.pms.service.IPmsCategoryService;
import com.mall.pms.mapper.IPmsCategoryMapper;
/**
 * <p>
 * 商品三级分类 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class PmsCategoryServiceImpl extends BaseServiceImpl<IPmsCategoryMapper,PmsCategory> implements IPmsCategoryService{

    @Resource
    private IPmsCategoryMapper PmsCategoryMapper;

}
