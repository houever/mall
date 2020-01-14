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
 * 专题商品
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "专题商品",description = "专题商品")
@EqualsAndHashCode(callSuper = false)
@TableName("sms_home_subject_spu")
public class SmsHomeSubjectSpu extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 专题名字
     */
                    @ApiModelProperty(value = "专题名字",example = "专题名字")
    private String name;
            /**
     * 专题id
     */
                    @ApiModelProperty(value = "专题id",example = "专题id")
    private Long subjectId;
            /**
     * spu_id
     */
                    @ApiModelProperty(value = "spu_id",example = "spu_id")
    private Long spuId;
            /**
     * 排序
     */
                    @ApiModelProperty(value = "排序",example = "排序")
    private Integer sort;



        }
