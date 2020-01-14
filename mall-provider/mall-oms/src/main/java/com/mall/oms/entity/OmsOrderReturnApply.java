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
 * 订单退货申请
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "订单退货申请", description = "订单退货申请")
@EqualsAndHashCode(callSuper = false)
@TableName("oms_order_return_apply")
public class OmsOrderReturnApply extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * order_id
     */
    @ApiModelProperty(value = "order_id", example = "order_id")
    private Long orderId;
    /**
     * 退货商品id
     */
    @ApiModelProperty(value = "退货商品id", example = "退货商品id")
    private Long skuId;
    /**
     * 订单编号
     */
    @ApiModelProperty(value = "订单编号", example = "订单编号")
    private String orderSn;
    /**
     * 会员用户名
     */
    @ApiModelProperty(value = "会员用户名", example = "会员用户名")
    private String memberUsername;
    /**
     * 退款金额
     */
    @ApiModelProperty(value = "退款金额", example = "退款金额")
    private BigDecimal returnAmount;
    /**
     * 退货人姓名
     */
    @ApiModelProperty(value = "退货人姓名", example = "退货人姓名")
    private String returnName;
    /**
     * 退货人电话
     */
    @ApiModelProperty(value = "退货人电话", example = "退货人电话")
    private String returnPhone;
    /**
     * 申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
     */
    @ApiModelProperty(value = "申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]", example = "申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]")
    private Integer status;
    /**
     * 处理时间
     */
    @ApiModelProperty(value = "处理时间", example = "处理时间")
    private Date handleTime;
    /**
     * 商品图片
     */
    @ApiModelProperty(value = "商品图片", example = "商品图片")
    private String skuImg;
    /**
     * 商品名称
     */
    @ApiModelProperty(value = "商品名称", example = "商品名称")
    private String skuName;
    /**
     * 商品品牌
     */
    @ApiModelProperty(value = "商品品牌", example = "商品品牌")
    private String skuBrand;
    /**
     * 商品销售属性(JSON)
     */
    @ApiModelProperty(value = "商品销售属性(JSON)", example = "商品销售属性(JSON)")
    private String skuAttrsVals;
    /**
     * 退货数量
     */
    @ApiModelProperty(value = "退货数量", example = "退货数量")
    private Integer skuCount;
    /**
     * 商品单价
     */
    @ApiModelProperty(value = "商品单价", example = "商品单价")
    private BigDecimal skuPrice;
    /**
     * 商品实际支付单价
     */
    @ApiModelProperty(value = "商品实际支付单价", example = "商品实际支付单价")
    private BigDecimal skuRealPrice;
    /**
     * 原因
     */
    @ApiModelProperty(value = "原因", example = "原因")
    private String reason;
    /**
     * 描述
     */
    @ApiModelProperty(value = "描述", example = "描述")
    private String description述;
    /**
     * 凭证图片，以逗号隔开
     */
    @ApiModelProperty(value = "凭证图片，以逗号隔开", example = "凭证图片，以逗号隔开")
    private String descPics;
    /**
     * 处理备注
     */
    @ApiModelProperty(value = "处理备注", example = "处理备注")
    private String handleNote;
    /**
     * 处理人员
     */
    @ApiModelProperty(value = "处理人员", example = "处理人员")
    private String handleMan;
    /**
     * 收货人
     */
    @ApiModelProperty(value = "收货人", example = "收货人")
    private String receiveMan;
    /**
     * 收货时间
     */
    @ApiModelProperty(value = "收货时间", example = "收货时间")
    private Date receiveTime;
    /**
     * 收货备注
     */
    @ApiModelProperty(value = "收货备注", example = "收货备注")
    private String receiveNote;
    /**
     * 收货电话
     */
    @ApiModelProperty(value = "收货电话", example = "收货电话")
    private String receivePhone;
    /**
     * 公司收货地址
     */
    @ApiModelProperty(value = "公司收货地址", example = "公司收货地址")
    private String companyAddress;


}
