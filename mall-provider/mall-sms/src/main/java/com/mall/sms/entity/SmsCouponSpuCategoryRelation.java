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
 * 优惠券分类关联
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "优惠券分类关联",description = "优惠券分类关联")
@EqualsAndHashCode(callSuper = false)
@TableName("sms_coupon_spu_category_relation")
public class SmsCouponSpuCategoryRelation extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 优惠券id
     */
                    @ApiModelProperty(value = "优惠券id",example = "优惠券id")
    private Long couponId;
            /**
     * 产品分类id
     */
                    @ApiModelProperty(value = "产品分类id",example = "产品分类id")
    private Long categoryId;
            /**
     * 产品分类名称
     */
                    @ApiModelProperty(value = "产品分类名称",example = "产品分类名称")
    private String categoryName;



        }
