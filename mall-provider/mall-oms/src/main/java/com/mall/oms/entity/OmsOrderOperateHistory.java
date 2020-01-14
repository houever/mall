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
 * 订单操作历史记录
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "订单操作历史记录",description = "订单操作历史记录")
@EqualsAndHashCode(callSuper = false)
@TableName("oms_order_operate_history")
public class OmsOrderOperateHistory extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 订单id
     */
                    @ApiModelProperty(value = "订单id",example = "订单id")
    private Long orderId;
            /**
     * 操作人[用户；系统；后台管理员]
     */
                    @ApiModelProperty(value = "操作人[用户；系统；后台管理员]",example = "操作人[用户；系统；后台管理员]")
    private String operateMan;
            /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
                    @ApiModelProperty(value = "订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】",example = "订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】")
    private Integer orderStatus;
            /**
     * 备注
     */
                    @ApiModelProperty(value = "备注",example = "备注")
    private String note;



        }
