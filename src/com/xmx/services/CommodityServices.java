package com.xmx.services;

import com.xmx.entity.Commodity;

import java.util.List;

public interface CommodityServices {
    int addCommodity(Commodity commodity);

    int deleteCommodity(int commodityNo);

    int updateCommodity(Commodity commodity);

    List<Commodity> findAll();

    Commodity findByNo(int commodityNo);
}
