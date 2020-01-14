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
 * 会员登录记录
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "会员登录记录",description = "会员登录记录")
@EqualsAndHashCode(callSuper = false)
@TableName("ums_member_login_log")
public class UmsMemberLoginLog extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * member_id
     */
                    @ApiModelProperty(value = "member_id",example = "member_id")
    private Long memberId;
            /**
     * ip
     */
                    @ApiModelProperty(value = "ip",example = "ip")
    private String ip;
            /**
     * city
     */
                    @ApiModelProperty(value = "city",example = "city")
    private String city;
            /**
     * 登录类型[1-web，2-app]
     */
                    @ApiModelProperty(value = "登录类型[1-web，2-app]",example = "登录类型[1-web，2-app]")
    private Integer loginType;



        }
