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
 * 秒杀商品通知订阅
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "秒杀商品通知订阅",description = "秒杀商品通知订阅")
@EqualsAndHashCode(callSuper = false)
@TableName("sms_seckill_sku_notice")
public class SmsSeckillSkuNotice extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * member_id
     */
                    @ApiModelProperty(value = "member_id",example = "member_id")
    private Long memberId;
            /**
     * sku_id
     */
                    @ApiModelProperty(value = "sku_id",example = "sku_id")
    private Long skuId;
            /**
     * 活动场次id
     */
                    @ApiModelProperty(value = "活动场次id",example = "活动场次id")
    private Long sessionId;
            /**
     * 订阅时间
     */
                    @ApiModelProperty(value = "订阅时间",example = "订阅时间")
    private Date subcribeTime;
            /**
     * 发送时间
     */
                    @ApiModelProperty(value = "发送时间",example = "发送时间")
    private Date sendTime;
            /**
     * 通知方式[0-短信，1-邮件]
     */
                    @ApiModelProperty(value = "通知方式[0-短信，1-邮件]",example = "通知方式[0-短信，1-邮件]")
    private Integer noticeType;



        }
