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
 * 会员收藏的专题活动
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "会员收藏的专题活动",description = "会员收藏的专题活动")
@EqualsAndHashCode(callSuper = false)
@TableName("ums_member_collect_subject")
public class UmsMemberCollectSubject extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * subject_id
     */
                    @ApiModelProperty(value = "subject_id",example = "subject_id")
    private Long subjectId;
            /**
     * subject_name
     */
                    @ApiModelProperty(value = "subject_name",example = "subject_name")
    private String subjectName;
            /**
     * subject_img
     */
                    @ApiModelProperty(value = "subject_img",example = "subject_img")
    private String subjectImg;
            /**
     * 活动url
     */
                    @ApiModelProperty(value = "活动url",example = "活动url")
    private String subjectUrll;



        }
