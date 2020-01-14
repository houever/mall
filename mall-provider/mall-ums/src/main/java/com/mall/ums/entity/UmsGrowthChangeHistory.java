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
 * 成长值变化历史记录
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "成长值变化历史记录",description = "成长值变化历史记录")
@EqualsAndHashCode(callSuper = false)
@TableName("ums_growth_change_history")
public class UmsGrowthChangeHistory extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * member_id
     */
                    @ApiModelProperty(value = "member_id",example = "member_id")
    private Long memberId;
            /**
     * 改变的值（正负计数）
     */
                    @ApiModelProperty(value = "改变的值（正负计数）",example = "改变的值（正负计数）")
    private Integer changeCount;
            /**
     * 备注
     */
                    @ApiModelProperty(value = "备注",example = "备注")
    private String note;
            /**
     * 积分来源[0-购物，1-管理员修改]
     */
                    @ApiModelProperty(value = "积分来源[0-购物，1-管理员修改]",example = "积分来源[0-购物，1-管理员修改]")
    private Integer sourceType;



        }
