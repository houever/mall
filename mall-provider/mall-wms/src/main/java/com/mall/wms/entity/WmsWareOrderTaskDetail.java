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
@TableName("wms_ware_order_task_detail")
public class WmsWareOrderTaskDetail extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * sku_id
     */
                    @ApiModelProperty(value = "sku_id",example = "sku_id")
    private Long skuId;
            /**
     * sku_name
     */
                    @ApiModelProperty(value = "sku_name",example = "sku_name")
    private String skuName;
            /**
     * 购买个数
     */
                    @ApiModelProperty(value = "购买个数",example = "购买个数")
    private Integer skuNum;
            /**
     * 工作单id
     */
                    @ApiModelProperty(value = "工作单id",example = "工作单id")
    private Long taskId;



        }
