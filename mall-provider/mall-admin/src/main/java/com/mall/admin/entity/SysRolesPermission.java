package com.mall.admin.entity;
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
 * 角色权限表
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "角色权限表",description = "角色权限表")
@EqualsAndHashCode(callSuper = false)
@TableName("sys_roles_permission")
public class SysRolesPermission extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 角色id
     */
                    @ApiModelProperty(value = "角色id",example = "角色id")
    private String rid;
            /**
     * 权限id
     */
                    @ApiModelProperty(value = "权限id",example = "权限id")
    private String pid;



        }
