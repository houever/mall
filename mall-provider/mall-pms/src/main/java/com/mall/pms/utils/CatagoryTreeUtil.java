package com.mall.pms.utils;

import com.mall.pms.entity.PmsCategory;
import com.mall.pms.model.CatagoryDTO;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author houqj
 * @date 2020-01-13 16:16
 */
public class CatagoryTreeUtil {

    private List<PmsCategory> categories;

    public List<CatagoryDTO> catagoryTree(List<PmsCategory> list) {
        this.categories = list;
        List<CatagoryDTO> catagoryDTOS = new ArrayList<CatagoryDTO>();
        CatagoryDTO catagoryDTO = null;
        for (PmsCategory p : list) {
            if (p.getParentCid() == 0) {
                catagoryDTO = new CatagoryDTO();
                catagoryDTO.setId(p.getCatId());
                catagoryDTO.setTitle(p.getName());
                catagoryDTO.setChildren(getCatagoryChild(p.getCatId()));
                catagoryDTOS.add(catagoryDTO);
            }
        }
        return catagoryDTOS;
    }

    private List<CatagoryDTO> getCatagoryChild(Long catId) {
        List<CatagoryDTO> catagoryDTOS = new ArrayList<CatagoryDTO>();
        CatagoryDTO catagoryDTO = null;
        for (PmsCategory p : categories) {
            if (p.getParentCid().equals(catId)) {
                catagoryDTO = new CatagoryDTO();
                catagoryDTO.setId(p.getCatId());
                catagoryDTO.setTitle(p.getName());
                catagoryDTO.setChildren(getCatagoryChild(p.getCatId()));
                catagoryDTOS.add(catagoryDTO);
            }
        }
        return catagoryDTOS;
    }
}
