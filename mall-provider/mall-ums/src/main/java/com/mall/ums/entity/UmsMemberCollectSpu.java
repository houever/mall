package com.mall.ums.entity;
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
 * 会员收藏的商品
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "会员收藏的商品",description = "会员收藏的商品")
@EqualsAndHashCode(callSuper = false)
@TableName("ums_member_collect_spu")
public class UmsMemberCollectSpu extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 会员id
     */
                    @ApiModelProperty(value = "会员id",example = "会员id")
    private Long memberId;
            /**
     * spu_id
     */
                    @ApiModelProperty(value = "spu_id",example = "spu_id")
    private Long spuId;
            /**
     * spu_name
     */
                    @ApiModelProperty(value = "spu_name",example = "spu_name")
    private String spuName;
            /**
     * spu_img
     */
                    @ApiModelProperty(value = "spu_img",example = "spu_img")
    private String spuImg;



        }
