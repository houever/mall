package com.mall.admin.model.form;

import cn.fast.web.base.BaseForm;
import com.mall.admin.entity.SysAccount;
import com.sun.istack.internal.NotNull;
import lombok.Data;

@Data
public class AccountForm extends BaseForm<SysAccount> {

    private String id;
    @NotNull
    private String username;
    private String password;

}
