package com.mall.sms.entity;
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
 * 优惠券领取历史记录
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "优惠券领取历史记录",description = "优惠券领取历史记录")
@EqualsAndHashCode(callSuper = false)
@TableName("sms_coupon_history")
public class SmsCouponHistory extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 优惠券id
     */
                    @ApiModelProperty(value = "优惠券id",example = "优惠券id")
    private Long couponId;
            /**
     * 会员id
     */
                    @ApiModelProperty(value = "会员id",example = "会员id")
    private Long memberId;
            /**
     * 会员名字
     */
                    @ApiModelProperty(value = "会员名字",example = "会员名字")
    private String memberNickName;
            /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
                    @ApiModelProperty(value = "获取方式[0->后台赠送；1->主动领取]",example = "获取方式[0->后台赠送；1->主动领取]")
    private Integer getType;
            /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
                    @ApiModelProperty(value = "使用状态[0->未使用；1->已使用；2->已过期]",example = "使用状态[0->未使用；1->已使用；2->已过期]")
    private Integer useType;
            /**
     * 使用时间
     */
                    @ApiModelProperty(value = "使用时间",example = "使用时间")
    private Date useTime;
            /**
     * 订单id
     */
                    @ApiModelProperty(value = "订单id",example = "订单id")
    private Long orderId;
            /**
     * 订单号
     */
                    @ApiModelProperty(value = "订单号",example = "订单号")
    private Long orderSn;



        }
