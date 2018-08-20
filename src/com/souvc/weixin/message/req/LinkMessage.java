package com.souvc.weixin.message.req;

/**
* 类名: LinkMessage </br>
* 描述: 请求消息之链接消息 </br>
* 开发人员： souvc </br>
* 创建时间：  Sep 29, 2015 </br>
* 发布版本：V1.0  </br>
 */
public class LinkMessage extends BaseMessage {

    // 消息标题
    private String Title;
    // 消息描述
    private String Description;
    // 消息链接
    private String Url;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
