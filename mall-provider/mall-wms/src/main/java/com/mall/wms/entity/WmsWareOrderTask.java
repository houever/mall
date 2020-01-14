package com.mall.wms.entity;
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
 * 库存工作单
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "库存工作单",description = "库存工作单")
@EqualsAndHashCode(callSuper = false)
@TableName("wms_ware_order_task")
public class WmsWareOrderTask extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * order_id
     */
                    @ApiModelProperty(value = "order_id",example = "order_id")
    private Long orderId;
            /**
     * order_sn
     */
                    @ApiModelProperty(value = "order_sn",example = "order_sn")
    private String orderSn;
            /**
     * 收货人
     */
                    @ApiModelProperty(value = "收货人",example = "收货人")
    private String consignee;
            /**
     * 收货人电话
     */
                    @ApiModelProperty(value = "收货人电话",example = "收货人电话")
    private String consigneeTel;
            /**
     * 配送地址
     */
                    @ApiModelProperty(value = "配送地址",example = "配送地址")
    private String deliveryAddress;
            /**
     * 订单备注
     */
                    @ApiModelProperty(value = "订单备注",example = "订单备注")
    private String orderComment;
            /**
     * 付款方式【 1:在线付款 2:货到付款】
     */
                    @ApiModelProperty(value = "付款方式【 1:在线付款 2:货到付款】",example = "付款方式【 1:在线付款 2:货到付款】")
    private Integer paymentWay;
            /**
     * 任务状态
     */
                    @ApiModelProperty(value = "任务状态",example = "任务状态")
    private Integer taskStatus;
            /**
     * 订单描述
     */
                    @ApiModelProperty(value = "订单描述",example = "订单描述")
    private String orderBody;
            /**
     * 物流单号
     */
                    @ApiModelProperty(value = "物流单号",example = "物流单号")
    private String trackingNo;
            /**
     * 仓库id
     */
                    @ApiModelProperty(value = "仓库id",example = "仓库id")
    private Long wareId;
            /**
     * 工作单备注
     */
                    @ApiModelProperty(value = "工作单备注",example = "工作单备注")
    private String taskComment;



        }
