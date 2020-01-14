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
 * 会员
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "会员",description = "会员")
@EqualsAndHashCode(callSuper = false)
@TableName("ums_member")
public class UmsMember extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 会员等级id
     */
                    @ApiModelProperty(value = "会员等级id",example = "会员等级id")
    private Long levelId;
            /**
     * 用户名
     */
                    @ApiModelProperty(value = "用户名",example = "用户名")
    private String username;
            /**
     * 密码
     */
                    @ApiModelProperty(value = "密码",example = "密码")
    private String password;
            /**
     * 昵称
     */
                    @ApiModelProperty(value = "昵称",example = "昵称")
    private String nickname;
            /**
     * 手机号码
     */
                    @ApiModelProperty(value = "手机号码",example = "手机号码")
    private String mobile;
            /**
     * 邮箱
     */
                    @ApiModelProperty(value = "邮箱",example = "邮箱")
    private String email;
            /**
     * 盐
     */
                    @ApiModelProperty(value = "盐",example = "盐")
    private String salt;
            /**
     * 头像
     */
                    @ApiModelProperty(value = "头像",example = "头像")
    private String header;
            /**
     * 性别
     */
                    @ApiModelProperty(value = "性别",example = "性别")
    private Integer gender;
            /**
     * 生日
     */
                    @ApiModelProperty(value = "生日",example = "生日")
    private Date birth;
            /**
     * 所在城市
     */
                    @ApiModelProperty(value = "所在城市",example = "所在城市")
    private String city;
            /**
     * 职业
     */
                    @ApiModelProperty(value = "职业",example = "职业")
    private String job;
            /**
     * 个性签名
     */
                    @ApiModelProperty(value = "个性签名",example = "个性签名")
    private String sign;
            /**
     * 用户来源
     */
                    @ApiModelProperty(value = "用户来源",example = "用户来源")
    private Integer sourceType;
            /**
     * 积分
     */
                    @ApiModelProperty(value = "积分",example = "积分")
    private Integer integration;
            /**
     * 成长值
     */
                    @ApiModelProperty(value = "成长值",example = "成长值")
    private Integer growth;
            /**
     * 启用状态
     */
                    @ApiModelProperty(value = "启用状态",example = "启用状态")
    private Integer status;



        }
