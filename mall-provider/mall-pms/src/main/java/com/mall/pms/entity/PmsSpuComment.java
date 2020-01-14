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
 * 商品评价
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "商品评价",description = "商品评价")
@EqualsAndHashCode(callSuper = false)
@TableName("pms_spu_comment")
public class PmsSpuComment extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * sku_id
     */
                    @ApiModelProperty(value = "sku_id",example = "sku_id")
    private Long skuId;
            /**
     * spu_id
     */
                    @ApiModelProperty(value = "spu_id",example = "spu_id")
    private Long spuId;
            /**
     * 商品名字
     */
                    @ApiModelProperty(value = "商品名字",example = "商品名字")
    private String spuName;
            /**
     * 会员昵称
     */
                    @ApiModelProperty(value = "会员昵称",example = "会员昵称")
    private String memberNickName;
            /**
     * 星级
     */
                    @ApiModelProperty(value = "星级",example = "星级")
    private Integer star;
            /**
     * 会员ip
     */
                    @ApiModelProperty(value = "会员ip",example = "会员ip")
    private String memberIp;
            /**
     * 显示状态[0-不显示，1-显示]
     */
                    @ApiModelProperty(value = "显示状态[0-不显示，1-显示]",example = "显示状态[0-不显示，1-显示]")
    private Integer showStatus;
            /**
     * 购买时属性组合
     */
                    @ApiModelProperty(value = "购买时属性组合",example = "购买时属性组合")
    private String spuAttributes;
            /**
     * 点赞数
     */
                    @ApiModelProperty(value = "点赞数",example = "点赞数")
    private Integer likesCount;
            /**
     * 回复数
     */
                    @ApiModelProperty(value = "回复数",example = "回复数")
    private Integer replyCount;
            /**
     * 评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
     */
                    @ApiModelProperty(value = "评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]",example = "评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]")
    private String resources;
            /**
     * 内容
     */
                    @ApiModelProperty(value = "内容",example = "内容")
    private String content;
            /**
     * 用户头像
     */
                    @ApiModelProperty(value = "用户头像",example = "用户头像")
    private String memberIcon;
            /**
     * 评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
     */
                    @ApiModelProperty(value = "评论类型[0 - 对商品的直接评论，1 - 对评论的回复]",example = "评论类型[0 - 对商品的直接评论，1 - 对评论的回复]")
    private Integer commentType;



        }
