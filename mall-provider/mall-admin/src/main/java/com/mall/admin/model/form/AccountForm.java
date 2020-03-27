package com.mall.admin.model.form;

import cn.fast.web.base.BaseForm;
import com.mall.admin.entity.SysAccount;
import lombok.Data;

@Data
public class AccountForm extends BaseForm<SysAccount> {

    private String id;
    private String username;
    private String password;

}
