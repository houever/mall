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
 * 退款信息
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "退款信息", description = "退款信息")
@EqualsAndHashCode(callSuper = false)
@TableName("oms_refund_info")
public class OmsRefundInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 退款的订单
     */
    @ApiModelProperty(value = "退款的订单", example = "退款的订单")
    private Long orderReturnId;
    /**
     * 退款金额
     */
    @ApiModelProperty(value = "退款金额", example = "退款金额")
    private BigDecimal refund;
    /**
     * 退款交易流水号
     */
    @ApiModelProperty(value = "退款交易流水号", example = "退款交易流水号")
    private String refundSn;
    /**
     * 退款状态
     */
    @ApiModelProperty(value = "退款状态", example = "退款状态")
    private Integer refundStatus;
    /**
     * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
     */
    @ApiModelProperty(value = "退款渠道[1-支付宝，2-微信，3-银联，4-汇款]", example = "退款渠道[1-支付宝，2-微信，3-银联，4-汇款]")
    private Integer refundChannel;
    @ApiModelProperty(value = "", example = "")
    private String refundContent;


}
