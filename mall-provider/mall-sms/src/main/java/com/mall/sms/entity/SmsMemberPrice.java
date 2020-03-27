package com.mall.sms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import cn.fast.web.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

/**
 * <p>
 * 商品会员价格
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "商品会员价格", description = "商品会员价格")
@EqualsAndHashCode(callSuper = false)
@TableName("sms_member_price")
public class SmsMemberPrice extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * sku_id
     */
    @ApiModelProperty(value = "sku_id", example = "sku_id")
    private Long skuId;
    /**
     * 会员等级id
     */
    @ApiModelProperty(value = "会员等级id", example = "会员等级id")
    private Long memberLevelId;
    /**
     * 会员等级名
     */
    @ApiModelProperty(value = "会员等级名", example = "会员等级名")
    private String memberLevelName;
    /**
     * 会员对应价格
     */
    @ApiModelProperty(value = "会员对应价格", example = "会员对应价格")
    private BigDecimal memberPrice;
    /**
     * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
     */
    @ApiModelProperty(value = "可否叠加其他优惠[0-不可叠加优惠，1-可叠加]", example = "可否叠加其他优惠[0-不可叠加优惠，1-可叠加]")
    private Integer addOther;


}
