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
 * 商品满减信息
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "商品满减信息", description = "商品满减信息")
@EqualsAndHashCode(callSuper = false)
@TableName("sms_spu_full_reduction")
public class SmsSpuFullReduction extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * spu_id
     */
    @ApiModelProperty(value = "spu_id", example = "spu_id")
    private Long spuId;
    /**
     * 满多少
     */
    @ApiModelProperty(value = "满多少", example = "满多少")
    private BigDecimal fullPrice;
    /**
     * 减多少
     */
    @ApiModelProperty(value = "减多少", example = "减多少")
    private BigDecimal reducePrice;
    /**
     * 是否参与其他优惠
     */
    @ApiModelProperty(value = "是否参与其他优惠", example = "是否参与其他优惠")
    private Integer addOther;


}
