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
 * 仓库信息
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "仓库信息",description = "仓库信息")
@EqualsAndHashCode(callSuper = false)
@TableName("wms_ware_info")
public class WmsWareInfo extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 仓库名
     */
                    @ApiModelProperty(value = "仓库名",example = "仓库名")
    private String name;
            /**
     * 仓库地址
     */
                    @ApiModelProperty(value = "仓库地址",example = "仓库地址")
    private String address;
            /**
     * 区域编码
     */
                    @ApiModelProperty(value = "区域编码",example = "区域编码")
    private String areacode;



        }
