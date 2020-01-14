package com.mall.pms.entity;

import cn.fast.web.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * <p>
 * sku信息
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "sku信息", description = "sku信息")
@EqualsAndHashCode(callSuper = false)
@TableName("pms_sku_info")
public class PmsSkuInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * skuId
     */
    @TableId(value = "sku_id", type = IdType.AUTO)
    @ApiModelProperty(value = "skuId", example = "skuId")
    private Long skuId;
    /**
     * spuId
     */
    @ApiModelProperty(value = "spuId", example = "spuId")
    private Long spuId;
    @ApiModelProperty(value = "", example = "")
    private String skuCode;
    /**
     * sku名称
     */
    @ApiModelProperty(value = "sku名称", example = "sku名称")
    private String skuName;
    /**
     * sku介绍描述
     */
    @ApiModelProperty(value = "sku介绍描述", example = "sku介绍描述")
    private String skuDesc;
    /**
     * 所属分类id
     */
    @ApiModelProperty(value = "所属分类id", example = "所属分类id")
    private Long catalogId;
    /**
     * 品牌id
     */
    @ApiModelProperty(value = "品牌id", example = "品牌id")
    private Long brandId;
    /**
     * 默认图片
     */
    @ApiModelProperty(value = "默认图片", example = "默认图片")
    private String skuDefaultImg;
    /**
     * 标题
     */
    @ApiModelProperty(value = "标题", example = "标题")
    private String skuTitle;
    /**
     * 副标题
     */
    @ApiModelProperty(value = "副标题", example = "副标题")
    private String skuSubtitle;
    /**
     * 价格
     */
    @ApiModelProperty(value = "价格", example = "价格")
    private BigDecimal price;
    /**
     * 重量
     */
    @ApiModelProperty(value = "重量", example = "重量")
    private BigDecimal weight;


}
