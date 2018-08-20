package com.souvc.weixin.message.req;

/**
* 类名: TextMessage </br>
* 描述: 请求消息之文本消息 </br>
* 开发人员： souvc </br>
* 创建时间：  Sep 29, 2015 </br>
* 发布版本：V1.0  </br>
 */

public class TextMessage extends BaseMessage {

    // 消息内容
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
