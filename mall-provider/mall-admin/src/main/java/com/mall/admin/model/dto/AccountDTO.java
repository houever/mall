package com.mall.admin.model.dto;

import com.mall.admin.entity.SysAccount;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class AccountDTO extends SysAccount {

    private String[] rids;

    private String roles;

    private String deptName;
}
