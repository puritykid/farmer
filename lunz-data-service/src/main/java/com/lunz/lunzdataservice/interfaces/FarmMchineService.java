package com.lunz.lunzdataservice.interfaces;

import com.lunz.lunzdataservice.domain.Machine;

import java.util.List;

public interface FarmMchineService {

    /**
     * @Description: 聚划算农机列表
     */
    public List<Machine> getSaleFarmerList();


    /**
     * @Description: 获取购物车列表
     */
    public List<Machine> getShopCarList(String userId);
}
