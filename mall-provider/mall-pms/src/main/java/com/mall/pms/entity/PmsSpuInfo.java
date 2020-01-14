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
 * spu信息
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "spu信息",description = "spu信息")
@EqualsAndHashCode(callSuper = false)
@TableName("pms_spu_info")
public class PmsSpuInfo extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 商品名称
     */
                    @ApiModelProperty(value = "商品名称",example = "商品名称")
    private String spuName;
            /**
     * 商品描述
     */
                    @ApiModelProperty(value = "商品描述",example = "商品描述")
    private String spuDescription;
            /**
     * 所属分类id
     */
                    @ApiModelProperty(value = "所属分类id",example = "所属分类id")
    private Long catalogId;
            /**
     * 品牌id
     */
                    @ApiModelProperty(value = "品牌id",example = "品牌id")
    private Long brandId;
            /**
     * 上架状态[0 - 下架，1 - 上架]
     */
                    @ApiModelProperty(value = "上架状态[0 - 下架，1 - 上架]",example = "上架状态[0 - 下架，1 - 上架]")
    private Integer publishStatus;
                        @ApiModelProperty(value = "",example = "")
    private Date uodateTime;



        }
