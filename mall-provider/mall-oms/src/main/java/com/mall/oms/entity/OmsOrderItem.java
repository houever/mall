package com.mall.oms.entity;

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
 * 订单项信息
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "订单项信息", description = "订单项信息")
@EqualsAndHashCode(callSuper = false)
@TableName("oms_order_item")
public class OmsOrderItem extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * order_id
     */
    @ApiModelProperty(value = "order_id", example = "order_id")
    private Long orderId;
    /**
     * order_sn
     */
    @ApiModelProperty(value = "order_sn", example = "order_sn")
    private String orderSn;
    /**
     * spu_id
     */
    @ApiModelProperty(value = "spu_id", example = "spu_id")
    private Long spuId;
    /**
     * spu_name
     */
    @ApiModelProperty(value = "spu_name", example = "spu_name")
    private String spuName;
    /**
     * spu_pic
     */
    @ApiModelProperty(value = "spu_pic", example = "spu_pic")
    private String spuPic;
    /**
     * 品牌
     */
    @ApiModelProperty(value = "品牌", example = "品牌")
    private String spuBrand;
    /**
     * 商品分类id
     */
    @ApiModelProperty(value = "商品分类id", example = "商品分类id")
    private Long categoryId;
    /**
     * 商品sku编号
     */
    @ApiModelProperty(value = "商品sku编号", example = "商品sku编号")
    private Long skuId;
    /**
     * 商品sku名字
     */
    @ApiModelProperty(value = "商品sku名字", example = "商品sku名字")
    private String skuName;
    /**
     * 商品sku图片
     */
    @ApiModelProperty(value = "商品sku图片", example = "商品sku图片")
    private String skuPic;
    /**
     * 商品sku价格
     */
    @ApiModelProperty(value = "商品sku价格", example = "商品sku价格")
    private BigDecimal skuPrice;
    /**
     * 商品购买的数量
     */
    @ApiModelProperty(value = "商品购买的数量", example = "商品购买的数量")
    private Integer skuQuantity;
    /**
     * 商品销售属性组合（JSON）
     */
    @ApiModelProperty(value = "商品销售属性组合（JSON）", example = "商品销售属性组合（JSON）")
    private String skuAttrsVals;
    /**
     * 商品促销分解金额
     */
    @ApiModelProperty(value = "商品促销分解金额", example = "商品促销分解金额")
    private BigDecimal promotionAmount;
    /**
     * 优惠券优惠分解金额
     */
    @ApiModelProperty(value = "优惠券优惠分解金额", example = "优惠券优惠分解金额")
    private BigDecimal couponAmount;
    /**
     * 积分优惠分解金额
     */
    @ApiModelProperty(value = "积分优惠分解金额", example = "积分优惠分解金额")
    private BigDecimal integrationAmount;
    /**
     * 该商品经过优惠后的分解金额
     */
    @ApiModelProperty(value = "该商品经过优惠后的分解金额", example = "该商品经过优惠后的分解金额")
    private BigDecimal realAmount;
    /**
     * 赠送积分
     */
    @ApiModelProperty(value = "赠送积分", example = "赠送积分")
    private Integer giftIntegration;
    /**
     * 赠送成长值
     */
    @ApiModelProperty(value = "赠送成长值", example = "赠送成长值")
    private Integer giftGrowth;


}
