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
 * spu信息介绍
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "spu信息介绍",description = "spu信息介绍")
@EqualsAndHashCode(callSuper = false)
@TableName("pms_spu_info_desc")
public class PmsSpuInfoDesc extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 商品id
     */
                    @ApiModelProperty(value = "商品id",example = "商品id")
    private Long spuId;
            /**
     * 商品介绍
     */
                    @ApiModelProperty(value = "商品介绍",example = "商品介绍")
    private String decript;



        }
