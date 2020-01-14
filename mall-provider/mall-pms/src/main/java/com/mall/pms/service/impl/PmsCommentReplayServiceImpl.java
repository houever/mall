package com.mall.pms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.pms.repository.PmsCommentReplayRepository;
import com.mall.pms.entity.PmsCommentReplay;
import com.mall.pms.service.IPmsCommentReplayService;
import com.mall.pms.mapper.IPmsCommentReplayMapper;
/**
 * <p>
 * 商品评价回复关系 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class PmsCommentReplayServiceImpl extends BaseServiceImpl<IPmsCommentReplayMapper,PmsCommentReplay> implements IPmsCommentReplayService{

    @Resource
    private IPmsCommentReplayMapper PmsCommentReplayMapper;

}
