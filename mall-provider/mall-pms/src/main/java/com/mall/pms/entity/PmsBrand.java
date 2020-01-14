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
 * 品牌
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "品牌",description = "品牌")
@EqualsAndHashCode(callSuper = false)
@TableName("pms_brand")
public class PmsBrand extends BaseEntity{

private static final long serialVersionUID=1L;

                /**
     * 品牌id
     */
                            @TableId(value = "brand_id", type = IdType.AUTO)
                            @ApiModelProperty(value = "品牌id",example = "品牌id")
    private Long brandId;
            /**
     * 品牌名
     */
                    @ApiModelProperty(value = "品牌名",example = "品牌名")
    private String name;
            /**
     * 品牌logo地址
     */
                    @ApiModelProperty(value = "品牌logo地址",example = "品牌logo地址")
    private String logo;
            /**
     * 介绍
     */
                    @ApiModelProperty(value = "介绍",example = "介绍")
    private String descript;
            /**
     * 显示状态[0-不显示；1-显示]
     */
                    @ApiModelProperty(value = "显示状态[0-不显示；1-显示]",example = "显示状态[0-不显示；1-显示]")
    private Integer showStatus;
            /**
     * 检索首字母
     */
                    @ApiModelProperty(value = "检索首字母",example = "检索首字母")
    private String firstLetter;
            /**
     * 排序
     */
                    @ApiModelProperty(value = "排序",example = "排序")
    private Integer sort;



        }
