package com.mall.pms.entity;
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
 * spu属性值
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "spu属性值",description = "spu属性值")
@EqualsAndHashCode(callSuper = false)
@TableName("pms_product_attr_value")
public class PmsProductAttrValue extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 商品id
     */
                    @ApiModelProperty(value = "商品id",example = "商品id")
    private Long spuId;
            /**
     * 属性id
     */
                    @ApiModelProperty(value = "属性id",example = "属性id")
    private Long attrId;
            /**
     * 属性名
     */
                    @ApiModelProperty(value = "属性名",example = "属性名")
    private String attrName;
            /**
     * 属性值
     */
                    @ApiModelProperty(value = "属性值",example = "属性值")
    private String attrValue;
            /**
     * 顺序
     */
                    @ApiModelProperty(value = "顺序",example = "顺序")
    private Integer attrSort;
            /**
     * 快速展示【是否展示在介绍上；0-否 1-是】
     */
                    @ApiModelProperty(value = "快速展示【是否展示在介绍上；0-否 1-是】",example = "快速展示【是否展示在介绍上；0-否 1-是】")
    private Integer quickShow;



        }
