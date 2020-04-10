package com.mall.admin.model.param;

import cn.fast.web.base.BaseForm;
import com.mall.admin.entity.SysAccount;
import lombok.Data;

@Data
public class AccountParam extends BaseForm<SysAccount> {

    private String id;
    private String username;
    private String password;

}
