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
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】",description = "首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】")
@EqualsAndHashCode(callSuper = false)
@TableName("sms_home_subject")
public class SmsHomeSubject extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 专题名字
     */
                    @ApiModelProperty(value = "专题名字",example = "专题名字")
    private String name;
            /**
     * 专题标题
     */
                    @ApiModelProperty(value = "专题标题",example = "专题标题")
    private String title;
            /**
     * 专题副标题
     */
                    @ApiModelProperty(value = "专题副标题",example = "专题副标题")
    private String subTitle;
            /**
     * 显示状态
     */
                    @ApiModelProperty(value = "显示状态",example = "显示状态")
    private Integer status;
            /**
     * 详情连接
     */
                    @ApiModelProperty(value = "详情连接",example = "详情连接")
    private String url;
            /**
     * 排序
     */
                    @ApiModelProperty(value = "排序",example = "排序")
    private Integer sort;
            /**
     * 专题图片地址
     */
                    @ApiModelProperty(value = "专题图片地址",example = "专题图片地址")
    private String img;



        }
