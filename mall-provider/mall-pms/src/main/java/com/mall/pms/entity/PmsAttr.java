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
 * 商品属性
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "商品属性",description = "商品属性")
@EqualsAndHashCode(callSuper = false)
@TableName("pms_attr")
public class PmsAttr extends BaseEntity{

private static final long serialVersionUID=1L;

                /**
     * 属性id
     */
                            @TableId(value = "attr_id", type = IdType.AUTO)
                            @ApiModelProperty(value = "属性id",example = "属性id")
    private Long attrId;
            /**
     * 属性名
     */
                    @ApiModelProperty(value = "属性名",example = "属性名")
    private String attrName;
            /**
     * 是否需要检索[0-不需要，1-需要]
     */
                    @ApiModelProperty(value = "是否需要检索[0-不需要，1-需要]",example = "是否需要检索[0-不需要，1-需要]")
    private Integer searchType;
            /**
     * 值类型[0-为单个值，1-可以选择多个值]
     */
                    @ApiModelProperty(value = "值类型[0-为单个值，1-可以选择多个值]",example = "值类型[0-为单个值，1-可以选择多个值]")
    private Integer valueType;
            /**
     * 属性图标
     */
                    @ApiModelProperty(value = "属性图标",example = "属性图标")
    private String icon;
            /**
     * 可选值列表[用逗号分隔]
     */
                    @ApiModelProperty(value = "可选值列表[用逗号分隔]",example = "可选值列表[用逗号分隔]")
    private String valueSelect;
            /**
     * 属性类型[0-销售属性，1-基本属性]
     */
                    @ApiModelProperty(value = "属性类型[0-销售属性，1-基本属性]",example = "属性类型[0-销售属性，1-基本属性]")
    private Integer attrType;
            /**
     * 启用状态[0 - 禁用，1 - 启用]
     */
                    @ApiModelProperty(value = "启用状态[0 - 禁用，1 - 启用]",example = "启用状态[0 - 禁用，1 - 启用]")
    private Long enable;
            /**
     * 所属分类
     */
                    @ApiModelProperty(value = "所属分类",example = "所属分类")
    private Long catelogId;
            /**
     * 快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
     */
                    @ApiModelProperty(value = "快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整",example = "快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整")
    private Integer showDesc;



        }
