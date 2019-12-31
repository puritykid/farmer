package com.lunz.lunzdataservice.interfaces;

public interface MeasureService {

    /**
     * @Description: 保存农机服务商测量的预估面积(步测 目测)
     */
    public void savePredictArea(String machineId);

    /**
     * @Description: 农机作业实际面积
     */
    public void saveRealArea(String machineId);



}
