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
 * 优惠券与产品关联
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "优惠券与产品关联",description = "优惠券与产品关联")
@EqualsAndHashCode(callSuper = false)
@TableName("sms_coupon_spu_relation")
public class SmsCouponSpuRelation extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 优惠券id
     */
                    @ApiModelProperty(value = "优惠券id",example = "优惠券id")
    private Long couponId;
            /**
     * spu_id
     */
                    @ApiModelProperty(value = "spu_id",example = "spu_id")
    private Long spuId;
            /**
     * spu_name
     */
                    @ApiModelProperty(value = "spu_name",example = "spu_name")
    private String spuName;



        }
