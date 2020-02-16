package com.mall.pms.service;
import cn.fast.web.base.BaseService;
import com.mall.pms.entity.PmsAttr;
/**
 * <p>
 * 商品属性 接口
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
public interface IPmsAttrService extends BaseService<PmsAttr>{

    PmsAttr selectById(String id);
}
