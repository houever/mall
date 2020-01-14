package com.mall.wms.entity;
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
 * 商品库存
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "商品库存",description = "商品库存")
@EqualsAndHashCode(callSuper = false)
@TableName("wms_ware_sku")
public class WmsWareSku extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * sku_id
     */
                    @ApiModelProperty(value = "sku_id",example = "sku_id")
    private Long skuId;
            /**
     * 仓库id
     */
                    @ApiModelProperty(value = "仓库id",example = "仓库id")
    private Long wareId;
            /**
     * 库存数
     */
                    @ApiModelProperty(value = "库存数",example = "库存数")
    private Integer stock;
            /**
     * sku_name
     */
                    @ApiModelProperty(value = "sku_name",example = "sku_name")
    private String skuName;
            /**
     * 锁定库存
     */
                    @ApiModelProperty(value = "锁定库存",example = "锁定库存")
    private Integer stockLocked;



        }
