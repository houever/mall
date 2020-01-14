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
 * spu图片
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "spu图片",description = "spu图片")
@EqualsAndHashCode(callSuper = false)
@TableName("pms_spu_images")
public class PmsSpuImages extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * spu_id
     */
                    @ApiModelProperty(value = "spu_id",example = "spu_id")
    private Long spuId;
            /**
     * 图片名
     */
                    @ApiModelProperty(value = "图片名",example = "图片名")
    private String imgName;
            /**
     * 图片地址
     */
                    @ApiModelProperty(value = "图片地址",example = "图片地址")
    private String imgUrl;
            /**
     * 顺序
     */
                    @ApiModelProperty(value = "顺序",example = "顺序")
    private Integer imgSort;
            /**
     * 是否默认图
     */
                    @ApiModelProperty(value = "是否默认图",example = "是否默认图")
    private Integer defaultImg;



        }
