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
 * 秒杀活动商品关联
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "秒杀活动商品关联",description = "秒杀活动商品关联")
@EqualsAndHashCode(callSuper = false)
@TableName("sms_seckill_sku_relation")
public class SmsSeckillSkuRelation extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 活动id
     */
                    @ApiModelProperty(value = "活动id",example = "活动id")
    private Long promotionId;
            /**
     * 活动场次id
     */
                    @ApiModelProperty(value = "活动场次id",example = "活动场次id")
    private Long promotionSessionId;
            /**
     * 商品id
     */
                    @ApiModelProperty(value = "商品id",example = "商品id")
    private Long skuId;
            /**
     * 秒杀价格
     */
                    @ApiModelProperty(value = "秒杀价格",example = "秒杀价格")
    private BigDecimal seckillPrice;
            /**
     * 秒杀总量
     */
                    @ApiModelProperty(value = "秒杀总量",example = "秒杀总量")
    private BigDecimal seckillCount;
            /**
     * 每人限购数量
     */
                    @ApiModelProperty(value = "每人限购数量",example = "每人限购数量")
    private BigDecimal seckillLimit;
            /**
     * 排序
     */
                    @ApiModelProperty(value = "排序",example = "排序")
    private Integer seckillSort;



        }
