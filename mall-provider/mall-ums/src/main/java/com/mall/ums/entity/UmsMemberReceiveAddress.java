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
 * 会员收货地址
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "会员收货地址",description = "会员收货地址")
@EqualsAndHashCode(callSuper = false)
@TableName("ums_member_receive_address")
public class UmsMemberReceiveAddress extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * member_id
     */
                    @ApiModelProperty(value = "member_id",example = "member_id")
    private Long memberId;
            /**
     * 收货人姓名
     */
                    @ApiModelProperty(value = "收货人姓名",example = "收货人姓名")
    private String name;
            /**
     * 电话
     */
                    @ApiModelProperty(value = "电话",example = "电话")
    private String phone;
            /**
     * 邮政编码
     */
                    @ApiModelProperty(value = "邮政编码",example = "邮政编码")
    private String postCode;
            /**
     * 省份/直辖市
     */
                    @ApiModelProperty(value = "省份/直辖市",example = "省份/直辖市")
    private String province;
            /**
     * 城市
     */
                    @ApiModelProperty(value = "城市",example = "城市")
    private String city;
            /**
     * 区
     */
                    @ApiModelProperty(value = "区",example = "区")
    private String region;
            /**
     * 详细地址(街道)
     */
                    @ApiModelProperty(value = "详细地址(街道)",example = "详细地址(街道)")
    private String detailAddress;
            /**
     * 省市区代码
     */
                    @ApiModelProperty(value = "省市区代码",example = "省市区代码")
    private String areacode;
            /**
     * 是否默认
     */
                    @ApiModelProperty(value = "是否默认",example = "是否默认")
    private Integer defaultStatus;



        }
