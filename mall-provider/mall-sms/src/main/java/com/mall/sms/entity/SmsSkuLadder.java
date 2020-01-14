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
 * 商品阶梯价格
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "商品阶梯价格",description = "商品阶梯价格")
@EqualsAndHashCode(callSuper = false)
@TableName("sms_sku_ladder")
public class SmsSkuLadder extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * spu_id
     */
                    @ApiModelProperty(value = "spu_id",example = "spu_id")
    private Long skuId;
            /**
     * 满几件
     */
                    @ApiModelProperty(value = "满几件",example = "满几件")
    private Integer fullCount;
            /**
     * 打几折
     */
                    @ApiModelProperty(value = "打几折",example = "打几折")
    private BigDecimal discount;
            /**
     * 折后价
     */
                    @ApiModelProperty(value = "折后价",example = "折后价")
    private BigDecimal price;
            /**
     * 是否叠加其他优惠[0-不可叠加，1-可叠加]
     */
                    @ApiModelProperty(value = "是否叠加其他优惠[0-不可叠加，1-可叠加]",example = "是否叠加其他优惠[0-不可叠加，1-可叠加]")
    private Integer addOther;



        }
