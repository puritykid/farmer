package com.lunz.lunzdataservice.interfaces;

import com.lunz.lunzdataservice.domain.Order;

public interface OrderService {


    /**
     * @Description: 农民支付定金
     */
    public void payAdvanceCash(Order order);

    /**
     * @Description: 平台创建订单
     */
    public void createOrder(Order order);

    /**
     * @Description: 取消订单
     */
    public void cancelOrder(String orderNo);

    /**
     * @Description: 农机服务商确认订单
     */
    public void plateFormConfirmOrder(String orderNo);


    /**
     * @Description: 农民确认订单
     */
    public void confirmOrder(String orderNo,String machineId);

    /**
     * @Description: 尾款计算
     */
    public String computerLastCash(String orderNo);

    /**
     * @Description: 支付尾款
     */
    public void payLastCash(String orderNo);


}
