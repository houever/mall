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
 * sku销售属性&值
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "sku销售属性&值",description = "sku销售属性&值")
@EqualsAndHashCode(callSuper = false)
@TableName("pms_sku_sale_attr_value")
public class PmsSkuSaleAttrValue extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * sku_id
     */
                    @ApiModelProperty(value = "sku_id",example = "sku_id")
    private Long skuId;
            /**
     * attr_id
     */
                    @ApiModelProperty(value = "attr_id",example = "attr_id")
    private Long attrId;
            /**
     * 销售属性名
     */
                    @ApiModelProperty(value = "销售属性名",example = "销售属性名")
    private String attrName;
            /**
     * 销售属性值
     */
                    @ApiModelProperty(value = "销售属性值",example = "销售属性值")
    private String attrValue;
            /**
     * 顺序
     */
                    @ApiModelProperty(value = "顺序",example = "顺序")
    private Integer attrSort;



        }
