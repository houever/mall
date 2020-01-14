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
 * 退货原因
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "退货原因",description = "退货原因")
@EqualsAndHashCode(callSuper = false)
@TableName("oms_order_return_reason")
public class OmsOrderReturnReason extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 退货原因名
     */
                    @ApiModelProperty(value = "退货原因名",example = "退货原因名")
    private String name;
            /**
     * 排序
     */
                    @ApiModelProperty(value = "排序",example = "排序")
    private Integer sort;
            /**
     * 启用状态
     */
                    @ApiModelProperty(value = "启用状态",example = "启用状态")
    private Integer status;



        }
