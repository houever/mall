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
 * 优惠券信息
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "优惠券信息", description = "优惠券信息")
@EqualsAndHashCode(callSuper = false)
@TableName("sms_coupon")
public class SmsCoupon extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
     */
    @ApiModelProperty(value = "优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]", example = "优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]")
    private Integer couponType;
    /**
     * 优惠券图片
     */
    @ApiModelProperty(value = "优惠券图片", example = "优惠券图片")
    private String couponImg;
    /**
     * 优惠卷名字
     */
    @ApiModelProperty(value = "优惠卷名字", example = "优惠卷名字")
    private String couponName;
    /**
     * 数量
     */
    @ApiModelProperty(value = "数量", example = "数量")
    private Integer num;
    /**
     * 金额
     */
    @ApiModelProperty(value = "金额", example = "金额")
    private BigDecimal amount;
    /**
     * 每人限领张数
     */
    @ApiModelProperty(value = "每人限领张数", example = "每人限领张数")
    private Integer perLimit;
    /**
     * 使用门槛
     */
    @ApiModelProperty(value = "使用门槛", example = "使用门槛")
    private BigDecimal minPoint;
    /**
     * 开始时间
     */
    @ApiModelProperty(value = "开始时间", example = "开始时间")
    private Date startTime;
    /**
     * 结束时间
     */
    @ApiModelProperty(value = "结束时间", example = "结束时间")
    private Date endTime;
    /**
     * 使用类型[0->全场通用；1->指定分类；2->指定商品]
     */
    @ApiModelProperty(value = "使用类型[0->全场通用；1->指定分类；2->指定商品]", example = "使用类型[0->全场通用；1->指定分类；2->指定商品]")
    private Integer useType;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", example = "备注")
    private String note;
    /**
     * 发行数量
     */
    @ApiModelProperty(value = "发行数量", example = "发行数量")
    private Integer publishCount;
    /**
     * 已使用数量
     */
    @ApiModelProperty(value = "已使用数量", example = "已使用数量")
    private Integer useCount;
    /**
     * 领取数量
     */
    @ApiModelProperty(value = "领取数量", example = "领取数量")
    private Integer receiveCount;
    /**
     * 可以领取的开始日期
     */
    @ApiModelProperty(value = "可以领取的开始日期", example = "可以领取的开始日期")
    private Date enableStartTime;
    /**
     * 可以领取的结束日期
     */
    @ApiModelProperty(value = "可以领取的结束日期", example = "可以领取的结束日期")
    private Date enableEndTime;
    /**
     * 优惠码
     */
    @ApiModelProperty(value = "优惠码", example = "优惠码")
    private String code;
    /**
     * 可以领取的会员等级[0->不限等级，其他-对应等级]
     */
    @ApiModelProperty(value = "可以领取的会员等级[0->不限等级，其他-对应等级]", example = "可以领取的会员等级[0->不限等级，其他-对应等级]")
    private Integer memberLevel;
    /**
     * 发布状态[0-未发布，1-已发布]
     */
    @ApiModelProperty(value = "发布状态[0-未发布，1-已发布]", example = "发布状态[0-未发布，1-已发布]")
    private Integer publish;


}
