package com.mall.ums.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.ums.repository.UmsMemberRepository;
import com.mall.ums.entity.UmsMember;
import com.mall.ums.service.IUmsMemberService;
import com.mall.ums.mapper.IUmsMemberMapper;
/**
 * <p>
 * 会员 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class UmsMemberServiceImpl extends BaseServiceImpl<IUmsMemberMapper,UmsMember> implements IUmsMemberService{

    @Resource
    private IUmsMemberMapper UmsMemberMapper;

}
