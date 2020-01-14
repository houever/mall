package com.mall.pms.model;

import lombok.Data;

import java.util.List;

/**
 * @author houqj
 * @date 2020-01-13 16:17
 */
@Data
public class CatagoryDTO {
    private Long id;
    private String title;
    private List<CatagoryDTO> children;
}
