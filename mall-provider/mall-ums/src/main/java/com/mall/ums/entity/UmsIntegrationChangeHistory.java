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
 * 积分变化历史记录
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "积分变化历史记录",description = "积分变化历史记录")
@EqualsAndHashCode(callSuper = false)
@TableName("ums_integration_change_history")
public class UmsIntegrationChangeHistory extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * member_id
     */
                    @ApiModelProperty(value = "member_id",example = "member_id")
    private Long memberId;
            /**
     * 变化的值
     */
                    @ApiModelProperty(value = "变化的值",example = "变化的值")
    private Integer changeCount;
            /**
     * 备注
     */
                    @ApiModelProperty(value = "备注",example = "备注")
    private String note;
            /**
     * 来源[0->购物；1->管理员修改;2->活动]
     */
                    @ApiModelProperty(value = "来源[0->购物；1->管理员修改;2->活动]",example = "来源[0->购物；1->管理员修改;2->活动]")
    private Integer sourceTyoe;



        }
