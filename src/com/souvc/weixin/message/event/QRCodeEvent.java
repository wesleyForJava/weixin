package com.souvc.weixin.message.event;

/**
* 类名: QRCodeEvent </br>
* 描述: 扫描带参数二维码事件 </br>
* 开发人员： souvc </br>
* 创建时间：  2015-9-30 </br>
* 发布版本：V1.0  </br>
 */
public class QRCodeEvent extends BaseEvent {
    // 事件KEY值
    private String EventKey;
    // 用于换取二维码图片
    private String Ticket;

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }
}