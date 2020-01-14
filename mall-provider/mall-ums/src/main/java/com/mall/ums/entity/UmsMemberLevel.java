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
 * 会员等级
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "会员等级",description = "会员等级")
@EqualsAndHashCode(callSuper = false)
@TableName("ums_member_level")
public class UmsMemberLevel extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 等级名称
     */
                    @ApiModelProperty(value = "等级名称",example = "等级名称")
    private String name;
            /**
     * 等级需要的成长值
     */
                    @ApiModelProperty(value = "等级需要的成长值",example = "等级需要的成长值")
    private Integer growthPoint;
            /**
     * 是否为默认等级[0->不是；1->是]
     */
                    @ApiModelProperty(value = "是否为默认等级[0->不是；1->是]",example = "是否为默认等级[0->不是；1->是]")
    private Integer defaultStatus;
            /**
     * 免运费标准
     */
                    @ApiModelProperty(value = "免运费标准",example = "免运费标准")
    private BigDecimal freeFreightPoint;
            /**
     * 每次评价获取的成长值
     */
                    @ApiModelProperty(value = "每次评价获取的成长值",example = "每次评价获取的成长值")
    private Integer commentGrowthPoint;
            /**
     * 是否有免邮特权
     */
                    @ApiModelProperty(value = "是否有免邮特权",example = "是否有免邮特权")
    private Integer priviledgeFreeFreight;
            /**
     * 是否有会员价格特权
     */
                    @ApiModelProperty(value = "是否有会员价格特权",example = "是否有会员价格特权")
    private Integer priviledgeMemberPrice;
            /**
     * 是否有生日特权
     */
                    @ApiModelProperty(value = "是否有生日特权",example = "是否有生日特权")
    private Integer priviledgeBirthday;
            /**
     * 备注
     */
                    @ApiModelProperty(value = "备注",example = "备注")
    private String note;



        }
