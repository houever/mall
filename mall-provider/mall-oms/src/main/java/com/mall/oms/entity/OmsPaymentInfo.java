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
 * 支付信息表
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "支付信息表", description = "支付信息表")
@EqualsAndHashCode(callSuper = false)
@TableName("oms_payment_info")
public class OmsPaymentInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号（对外业务号）
     */
    @ApiModelProperty(value = "订单号（对外业务号）", example = "订单号（对外业务号）")
    private String orderSn;
    /**
     * 订单id
     */
    @ApiModelProperty(value = "订单id", example = "订单id")
    private Long orderId;
    /**
     * 支付宝交易流水号
     */
    @ApiModelProperty(value = "支付宝交易流水号", example = "支付宝交易流水号")
    private String alipayTradeNo;
    /**
     * 支付总金额
     */
    @ApiModelProperty(value = "支付总金额", example = "支付总金额")
    private BigDecimal totalAmount;
    /**
     * 交易内容
     */
    @ApiModelProperty(value = "交易内容", example = "交易内容")
    private String subject;
    /**
     * 支付状态
     */
    @ApiModelProperty(value = "支付状态", example = "支付状态")
    private String paymentStatus;
    /**
     * 确认时间
     */
    @ApiModelProperty(value = "确认时间", example = "确认时间")
    private Date confirmTime;
    /**
     * 回调内容
     */
    @ApiModelProperty(value = "回调内容", example = "回调内容")
    private String callbackContent;
    /**
     * 回调时间
     */
    @ApiModelProperty(value = "回调时间", example = "回调时间")
    private Date callbackTime;


}
