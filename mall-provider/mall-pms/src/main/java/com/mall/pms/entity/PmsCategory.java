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
 * 商品三级分类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "商品三级分类", description = "商品三级分类")
@EqualsAndHashCode(callSuper = false)
@TableName("pms_category")
public class PmsCategory extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 分类id
     */
    @TableId(value = "cat_id", type = IdType.AUTO)
    @ApiModelProperty(value = "分类id", example = "分类id")
    private Long catId;
    /**
     * 分类名称
     */
    @ApiModelProperty(value = "分类名称", example = "分类名称")
    private String name;
    /**
     * 父分类id
     */
    @ApiModelProperty(value = "父分类id", example = "父分类id")
    private Long parentCid;
    /**
     * 层级
     */
    @ApiModelProperty(value = "层级", example = "层级")
    private Integer catLevel;
    /**
     * 是否显示[0-不显示，1显示]
     */
    @ApiModelProperty(value = "是否显示[0-不显示，1显示]", example = "是否显示[0-不显示，1显示]")
    private Integer showStatus;
    /**
     * 排序
     */
    @ApiModelProperty(value = "排序", example = "排序")
    private Integer sort;
    /**
     * 图标地址
     */
    @ApiModelProperty(value = "图标地址", example = "图标地址")
    private String icon;
    /**
     * 计量单位
     */
    @ApiModelProperty(value = "计量单位", example = "计量单位")
    private String productUnit;
    /**
     * 商品数量
     */
    @ApiModelProperty(value = "商品数量", example = "商品数量")
    private Integer productCount;


}
