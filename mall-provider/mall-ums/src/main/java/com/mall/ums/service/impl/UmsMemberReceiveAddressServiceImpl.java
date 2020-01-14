package com.mall.ums.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.ums.repository.UmsMemberReceiveAddressRepository;
import com.mall.ums.entity.UmsMemberReceiveAddress;
import com.mall.ums.service.IUmsMemberReceiveAddressService;
import com.mall.ums.mapper.IUmsMemberReceiveAddressMapper;
/**
 * <p>
 * 会员收货地址 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class UmsMemberReceiveAddressServiceImpl extends BaseServiceImpl<IUmsMemberReceiveAddressMapper,UmsMemberReceiveAddress> implements IUmsMemberReceiveAddressService{

    @Resource
    private IUmsMemberReceiveAddressMapper UmsMemberReceiveAddressMapper;

}
