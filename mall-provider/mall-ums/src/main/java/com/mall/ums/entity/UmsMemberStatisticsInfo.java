package com.mall.ums.entity;

import cn.fast.web.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * <p>
 * 会员统计信息
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "会员统计信息", description = "会员统计信息")
@EqualsAndHashCode(callSuper = false)
@TableName("ums_member_statistics_info")
public class UmsMemberStatisticsInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 会员id
     */
    @ApiModelProperty(value = "会员id", example = "会员id")
    private Long memberId;
    /**
     * 累计消费金额
     */
    @ApiModelProperty(value = "累计消费金额", example = "累计消费金额")
    private BigDecimal consumeAmount;
    /**
     * 累计优惠金额
     */
    @ApiModelProperty(value = "累计优惠金额", example = "累计优惠金额")
    private BigDecimal couponAmount;
    /**
     * 订单数量
     */
    @ApiModelProperty(value = "订单数量", example = "订单数量")
    private Integer orderCount;
    /**
     * 优惠券数量
     */
    @ApiModelProperty(value = "优惠券数量", example = "优惠券数量")
    private Integer couponCount;
    /**
     * 评价数
     */
    @ApiModelProperty(value = "评价数", example = "评价数")
    private Integer commentCount;
    /**
     * 退货数量
     */
    @ApiModelProperty(value = "退货数量", example = "退货数量")
    private Integer returnOrderCount;
    /**
     * 登录次数
     */
    @ApiModelProperty(value = "登录次数", example = "登录次数")
    private Integer loginCount;
    /**
     * 关注数量
     */
    @ApiModelProperty(value = "关注数量", example = "关注数量")
    private Integer attendCount;
    /**
     * 粉丝数量
     */
    @ApiModelProperty(value = "粉丝数量", example = "粉丝数量")
    private Integer fansCount;
    /**
     * 收藏的商品数量
     */
    @ApiModelProperty(value = "收藏的商品数量", example = "收藏的商品数量")
    private Integer collectProductCount;
    /**
     * 收藏的专题活动数量
     */
    @ApiModelProperty(value = "收藏的专题活动数量", example = "收藏的专题活动数量")
    private Integer collectSubjectCount;
    /**
     * 收藏的评论数量
     */
    @ApiModelProperty(value = "收藏的评论数量", example = "收藏的评论数量")
    private Integer collectCommentCount;
    /**
     * 邀请的朋友数量
     */
    @ApiModelProperty(value = "邀请的朋友数量", example = "邀请的朋友数量")
    private Integer inviteFriendCount;


}
