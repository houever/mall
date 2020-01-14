package com.mall.ums.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.ums.repository.UmsMemberLevelRepository;
import com.mall.ums.entity.UmsMemberLevel;
import com.mall.ums.service.IUmsMemberLevelService;
import com.mall.ums.mapper.IUmsMemberLevelMapper;
/**
 * <p>
 * 会员等级 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class UmsMemberLevelServiceImpl extends BaseServiceImpl<IUmsMemberLevelMapper,UmsMemberLevel> implements IUmsMemberLevelService{

    @Resource
    private IUmsMemberLevelMapper UmsMemberLevelMapper;

}
