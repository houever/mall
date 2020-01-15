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
 * 属性&属性分组关联
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "属性&属性分组关联", description = "属性&属性分组关联")
@EqualsAndHashCode(callSuper = false)
@TableName("pms_attr_attrgroup_relation")
public class PmsAttrAttrgroupRelation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    @ApiModelProperty(value = "属性id", example = "属性id")
    private Long attrId;
    /**
     * 属性分组id
     */
    @ApiModelProperty(value = "属性分组id", example = "属性分组id")
    private Long attrGroupId;
    /**
     * 属性组内排序
     */
    @ApiModelProperty(value = "属性组内排序", example = "属性组内排序")
    private Integer attrSort;


}
