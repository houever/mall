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
 * 商品评价回复关系
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "商品评价回复关系",description = "商品评价回复关系")
@EqualsAndHashCode(callSuper = false)
@TableName("pms_comment_replay")
public class PmsCommentReplay extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 评论id
     */
                    @ApiModelProperty(value = "评论id",example = "评论id")
    private Long commentId;
            /**
     * 回复id
     */
                    @ApiModelProperty(value = "回复id",example = "回复id")
    private Long replyId;



        }
