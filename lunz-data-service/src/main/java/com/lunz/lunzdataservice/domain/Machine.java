package com.lunz.lunzdataservice.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Machine implements Serializable {



    private String id;

    /**
     * 机器类型
     */
    private String machineName;

    /**
     * 耕种类型
     */
    private String ploughType;

    private String beginDate;

    private String endDate;

    /**
     * 预估面积
     */
    private String evaluateArea;

    /**
     * 预估面积
     */
    private String realArea;

    /**
     * 适用地区
     */
    private List<String> properAreas;

    /**
     * 每平米价格
     */
    private String unitPrice;

    /**
     * 机器所属
     */
    private String machineBelong;

    /**
     * 机器状态 1-待进行  2-
     */
    private String machineStatus;


}
