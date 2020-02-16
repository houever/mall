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
 * 属性分组
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "属性分组", description = "属性分组")
@EqualsAndHashCode(callSuper = false)
@TableName("pms_attr_group")
public class PmsAttrGroup extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 分组id
     */
    @TableId(value = "attr_group_id", type = IdType.AUTO)
    @ApiModelProperty(value = "分组id", example = "分组id")
    private Long attrGroupId;
    /**
     * 组名
     */
    @ApiModelProperty(value = "组名", example = "组名")
    private String attrGroupName;
    /**
     * 排序
     */
    @ApiModelProperty(value = "排序", example = "排序")
    private Integer sort;
    /**
     * 描述
     */
    @ApiModelProperty(value = "描述", example = "描述")
    private String descript;
    /**
     * 组图标
     */
    @ApiModelProperty(value = "组图标", example = "组图标")
    private String icon;
    /**
     * 所属分类id
     */
    @ApiModelProperty(value = "所属分类id", example = "所属分类id")
    private Long catelogId;


}
