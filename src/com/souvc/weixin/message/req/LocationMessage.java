package com.souvc.weixin.message.req;

/**
* 类名: LocationMessage </br>
* 描述: 请求消息之地理位置消息 </br>
* 开发人员：souvc</br>
* 创建时间：  Sep 29, 2015 </br>
* 发布版本：V1.0  </br>
 */
public class LocationMessage extends BaseMessage {
    
    // 地理位置维度
    private String Location_X;
    // 地理位置经度
    private String Location_Y;
    // 地图缩放大小
    private String Scale;
    // 地理位置信息
    private String Label;

    
    public String getLocation_X() {
        return Location_X;
    }

    public void setLocation_X(String location_X) {
        Location_X = location_X;
    }

    public String getLocation_Y() {
        return Location_Y;
    }

    public void setLocation_Y(String location_Y) {
        Location_Y = location_Y;
    }

    public String getScale() {
        return Scale;
    }

    public void setScale(String scale) {
        Scale = scale;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }
}
