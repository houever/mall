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
 * sku图片
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "sku图片",description = "sku图片")
@EqualsAndHashCode(callSuper = false)
@TableName("pms_sku_images")
public class PmsSkuImages extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * sku_id
     */
                    @ApiModelProperty(value = "sku_id",example = "sku_id")
    private Long skuId;
            /**
     * 图片地址
     */
                    @ApiModelProperty(value = "图片地址",example = "图片地址")
    private String imgUrl;
            /**
     * 排序
     */
                    @ApiModelProperty(value = "排序",example = "排序")
    private Integer imgSort;
            /**
     * 默认图[0 - 不是默认图，1 - 是默认图]
     */
                    @ApiModelProperty(value = "默认图[0 - 不是默认图，1 - 是默认图]",example = "默认图[0 - 不是默认图，1 - 是默认图]")
    private Integer defaultImg;



        }
