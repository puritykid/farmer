package com.lunz.lunzdataservice.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Order implements Serializable {


    private String Id;
    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 订单状态 1-待平台确认 2-平台已确认  3-农
     */
    private String orderStatus;

    /**
     * 订单时间
     */
    private String orderDate;


    private String userId;


    private String machineId;

}
