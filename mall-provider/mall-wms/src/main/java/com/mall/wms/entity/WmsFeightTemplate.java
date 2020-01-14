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
 * 运费模板
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "运费模板",description = "运费模板")
@EqualsAndHashCode(callSuper = false)
@TableName("wms_feight_template")
public class WmsFeightTemplate extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * name
     */
                    @ApiModelProperty(value = "name",example = "name")
    private String name;
            /**
     * 计费类型【0->按重量，1->按件数】
     */
                    @ApiModelProperty(value = "计费类型【0->按重量，1->按件数】",example = "计费类型【0->按重量，1->按件数】")
    private Integer chargeType;
            /**
     * 首重
     */
                    @ApiModelProperty(value = "首重",example = "首重")
    private BigDecimal firstWeight;
            /**
     * 首费
     */
                    @ApiModelProperty(value = "首费",example = "首费")
    private BigDecimal firstFee;
            /**
     * 续重
     */
                    @ApiModelProperty(value = "续重",example = "续重")
    private BigDecimal continueWeight;
            /**
     * 续费
     */
                    @ApiModelProperty(value = "续费",example = "续费")
    private BigDecimal continueFee;
            /**
     * 目的地
     */
                    @ApiModelProperty(value = "目的地",example = "目的地")
    private Long dest;



        }
