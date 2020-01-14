package com.mall.oms.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
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
 * 订单配置信息
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "订单配置信息",description = "订单配置信息")
@EqualsAndHashCode(callSuper = false)
@TableName("oms_order_setting")
public class OmsOrderSetting extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 秒杀订单超时关闭时间(分)
     */
                    @ApiModelProperty(value = "秒杀订单超时关闭时间(分)",example = "秒杀订单超时关闭时间(分)")
    private Integer flashOrderOvertime;
            /**
     * 正常订单超时时间(分)
     */
                    @ApiModelProperty(value = "正常订单超时时间(分)",example = "正常订单超时时间(分)")
    private Integer normalOrderOvertime;
            /**
     * 发货后自动确认收货时间（天）
     */
                    @ApiModelProperty(value = "发货后自动确认收货时间（天）",example = "发货后自动确认收货时间（天）")
    private Integer confirmOvertime;
            /**
     * 自动完成交易时间，不能申请退货（天）
     */
                    @ApiModelProperty(value = "自动完成交易时间，不能申请退货（天）",example = "自动完成交易时间，不能申请退货（天）")
    private Integer finishOvertime;
            /**
     * 订单完成后自动好评时间（天）
     */
                    @ApiModelProperty(value = "订单完成后自动好评时间（天）",example = "订单完成后自动好评时间（天）")
    private Integer commentOvertime;
            /**
     * 会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】
     */
                    @ApiModelProperty(value = "会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】",example = "会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】")
    private Integer memberLevel;



        }
