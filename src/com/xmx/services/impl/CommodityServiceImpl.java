package com.xmx.services.impl;

import com.xmx.dao.CommodityDao;
import com.xmx.entity.Commodity;
import com.xmx.services.CommodityServices;

import java.util.List;

public class CommodityServiceImpl implements CommodityServices {
    CommodityDao commodityDao = new CommodityDao();
    @Override
    public int addCommodity(Commodity commodity){
        return commodityDao.add(commodity);
    }

    @Override
    public int deleteCommodity(int commodityNo){
        return commodityDao.delete(commodityNo);
    }

    @Override
    public int updateCommodity(Commodity commodity){
        return commodityDao.update(commodity);
    }

    @Override
    public List<Commodity> findAll(){
        return commodityDao.findAll();
    }

    @Override
    public Commodity findByNo(int commodityNo){return commodityDao.findByNo(commodityNo);}

}
