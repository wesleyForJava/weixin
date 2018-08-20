package com.souvc.weixin.message.event;

/**
* 类名: LocationEvent </br>
* 描述: 上报地理位置事件 </br>
* 开发人员： liuhf </br>
* 创建时间：  2015-9-30 </br>
* 发布版本：V1.0  </br>
 */
public class LocationEvent extends BaseEvent {
    // 地理位置纬度
    private String Latitude;
    // 地理位置经度
    private String Longitude;
    // 地理位置精度
    private String Precision;

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getPrecision() {
        return Precision;
    }

    public void setPrecision(String precision) {
        Precision = precision;
    }
}