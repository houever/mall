package com.mall.ums.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.ums.repository.UmsMemberCollectSpuRepository;
import com.mall.ums.entity.UmsMemberCollectSpu;
import com.mall.ums.service.IUmsMemberCollectSpuService;
import com.mall.ums.mapper.IUmsMemberCollectSpuMapper;
/**
 * <p>
 * 会员收藏的商品 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class UmsMemberCollectSpuServiceImpl extends BaseServiceImpl<IUmsMemberCollectSpuMapper,UmsMemberCollectSpu> implements IUmsMemberCollectSpuService{

    @Resource
    private IUmsMemberCollectSpuMapper UmsMemberCollectSpuMapper;

}
