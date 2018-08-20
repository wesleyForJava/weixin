package com.souvc.weixin.message.req;
/**
* 类名: VideoMessage </br>
* 描述: 请求消息之视频消息 </br>
* 开发人员： souvc </br>
* 创建时间：  Sep 29, 2015 </br>
* 发布版本：V1.0  </br>
 */
public class VideoMessage  extends BaseMessage{

    // 媒体ID
    private String MediaId;
    // 语音格式
    private String ThumbMediaId;

    public String getMediaId() {
        return MediaId;
    }
    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
    public String getThumbMediaId() {
        return ThumbMediaId;
    }
    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
