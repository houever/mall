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
 * 秒杀活动
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "秒杀活动",description = "秒杀活动")
@EqualsAndHashCode(callSuper = false)
@TableName("sms_seckill_promotion")
public class SmsSeckillPromotion extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 活动标题
     */
                    @ApiModelProperty(value = "活动标题",example = "活动标题")
    private String title;
            /**
     * 开始日期
     */
                    @ApiModelProperty(value = "开始日期",example = "开始日期")
    private Date startTime;
            /**
     * 结束日期
     */
                    @ApiModelProperty(value = "结束日期",example = "结束日期")
    private Date endTime;
            /**
     * 上下线状态
     */
                    @ApiModelProperty(value = "上下线状态",example = "上下线状态")
    private Integer status;
            /**
     * 创建人
     */
                    @ApiModelProperty(value = "创建人",example = "创建人")
    private Long userId;



        }
