package com.mall.sms.entity;
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
 * 首页轮播广告
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "首页轮播广告",description = "首页轮播广告")
@EqualsAndHashCode(callSuper = false)
@TableName("sms_home_adv")
public class SmsHomeAdv extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 名字
     */
                    @ApiModelProperty(value = "名字",example = "名字")
    private String name;
            /**
     * 图片地址
     */
                    @ApiModelProperty(value = "图片地址",example = "图片地址")
    private String pic;
            /**
     * 开始时间
     */
                    @ApiModelProperty(value = "开始时间",example = "开始时间")
    private Date startTime;
            /**
     * 结束时间
     */
                    @ApiModelProperty(value = "结束时间",example = "结束时间")
    private Date endTime;
            /**
     * 状态
     */
                    @ApiModelProperty(value = "状态",example = "状态")
    private Integer status;
            /**
     * 点击数
     */
                    @ApiModelProperty(value = "点击数",example = "点击数")
    private Integer clickCount;
            /**
     * 广告详情连接地址
     */
                    @ApiModelProperty(value = "广告详情连接地址",example = "广告详情连接地址")
    private String url;
            /**
     * 备注
     */
                    @ApiModelProperty(value = "备注",example = "备注")
    private String note;
            /**
     * 排序
     */
                    @ApiModelProperty(value = "排序",example = "排序")
    private Integer sort;
            /**
     * 发布者
     */
                    @ApiModelProperty(value = "发布者",example = "发布者")
    private Long publisherId;
            /**
     * 审核者
     */
                    @ApiModelProperty(value = "审核者",example = "审核者")
    private Long authId;



        }
