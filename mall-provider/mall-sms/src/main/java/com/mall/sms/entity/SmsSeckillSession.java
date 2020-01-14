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
 * 秒杀活动场次
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "秒杀活动场次",description = "秒杀活动场次")
@EqualsAndHashCode(callSuper = false)
@TableName("sms_seckill_session")
public class SmsSeckillSession extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 场次名称
     */
                    @ApiModelProperty(value = "场次名称",example = "场次名称")
    private String name;
            /**
     * 每日开始时间
     */
                    @ApiModelProperty(value = "每日开始时间",example = "每日开始时间")
    private Date startTime;
            /**
     * 每日结束时间
     */
                    @ApiModelProperty(value = "每日结束时间",example = "每日结束时间")
    private Date endTime;
            /**
     * 启用状态
     */
                    @ApiModelProperty(value = "启用状态",example = "启用状态")
    private Integer status;



        }
