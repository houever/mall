package com.mall.wms.entity;
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
 * 全国省市区信息
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "全国省市区信息",description = "全国省市区信息")
@EqualsAndHashCode(callSuper = false)
@TableName("wms_sh_area")
public class WmsShArea extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 父id
     */
                    @ApiModelProperty(value = "父id",example = "父id")
    private Integer pid;
            /**
     * 简称
     */
                    @ApiModelProperty(value = "简称",example = "简称")
    private String shortname;
            /**
     * 名称
     */
                    @ApiModelProperty(value = "名称",example = "名称")
    private String name;
            /**
     * 全称
     */
                    @ApiModelProperty(value = "全称",example = "全称")
    private String mergerName;
            /**
     * 层级 0 1 2 省市区县
     */
                    @ApiModelProperty(value = "层级 0 1 2 省市区县",example = "层级 0 1 2 省市区县")
    private Integer level;
            /**
     * 拼音
     */
                    @ApiModelProperty(value = "拼音",example = "拼音")
    private String pinyin;
            /**
     * 长途区号
     */
                    @ApiModelProperty(value = "长途区号",example = "长途区号")
    private String code;
            /**
     * 邮编
     */
                    @ApiModelProperty(value = "邮编",example = "邮编")
    private String zipCode;
            /**
     * 首字母
     */
                    @ApiModelProperty(value = "首字母",example = "首字母")
    private String first;
            /**
     * 经度
     */
                    @ApiModelProperty(value = "经度",example = "经度")
    private String lng;
            /**
     * 纬度
     */
                    @ApiModelProperty(value = "纬度",example = "纬度")
    private String lat;



        }
