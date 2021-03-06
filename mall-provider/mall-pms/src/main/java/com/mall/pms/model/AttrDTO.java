package com.mall.pms.model;

import lombok.Data;

/**
 * @Description: TODO
 * @Author houqj
 * @Date 2020/2/16 
 * @Version V1.0
 **/
@Data
public class AttrDTO {
    private Long catelogId;
    private Long attrGroupId;

    private String attrName;
    private String valueSelect;
    private Integer attrType;
    private Integer searchType;
    private Integer valueType;
    private Long enable;
    private Integer showDesc;
}
