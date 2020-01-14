package com.mall.pms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.pms.repository.PmsSpuCommentRepository;
import com.mall.pms.entity.PmsSpuComment;
import com.mall.pms.service.IPmsSpuCommentService;
import com.mall.pms.mapper.IPmsSpuCommentMapper;
/**
 * <p>
 * 商品评价 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class PmsSpuCommentServiceImpl extends BaseServiceImpl<IPmsSpuCommentMapper,PmsSpuComment> implements IPmsSpuCommentService{

    @Resource
    private IPmsSpuCommentMapper PmsSpuCommentMapper;

}
