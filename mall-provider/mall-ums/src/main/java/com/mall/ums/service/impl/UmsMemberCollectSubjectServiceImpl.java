package com.mall.ums.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.ums.repository.UmsMemberCollectSubjectRepository;
import com.mall.ums.entity.UmsMemberCollectSubject;
import com.mall.ums.service.IUmsMemberCollectSubjectService;
import com.mall.ums.mapper.IUmsMemberCollectSubjectMapper;
/**
 * <p>
 * 会员收藏的专题活动 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class UmsMemberCollectSubjectServiceImpl extends BaseServiceImpl<IUmsMemberCollectSubjectMapper,UmsMemberCollectSubject> implements IUmsMemberCollectSubjectService{

    @Resource
    private IUmsMemberCollectSubjectMapper UmsMemberCollectSubjectMapper;

}
