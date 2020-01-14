package com.mall.admin.model.dto;

import com.mall.admin.entity.SysDepartment;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class DeptDTO extends SysDepartment {

    private String title;

    public List<DeptDTO> children;
}
