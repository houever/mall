package com.mall.pms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.pms.repository.PmsSpuImagesRepository;
import com.mall.pms.entity.PmsSpuImages;
import com.mall.pms.service.IPmsSpuImagesService;
import com.mall.pms.mapper.IPmsSpuImagesMapper;
/**
 * <p>
 * spu图片 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class PmsSpuImagesServiceImpl extends BaseServiceImpl<IPmsSpuImagesMapper,PmsSpuImages> implements IPmsSpuImagesService{

    @Resource
    private IPmsSpuImagesMapper PmsSpuImagesMapper;

}
