package com.tmacbo.kotlinutils.server.req;

/**
 * @Author tmacbo
 * @Since on 2017/6/30  16:36
 * @mail tang_bo@hotmail.com
 * @Description TODO
 */

public class LoginRequest {
    //系统平台登录
    private String phone;        //	手机号码
    private String passwd;    //	密码
    private String type;    //值范围：患者："m"，医生："d"
    private String deviceId;

    ///第三平台登录
    private String openIdSource;//第三方登录来源，微信：weixin，微博：weibo，QQ：qq
    private String openId;//uid,第三方授权标识
    private String token;//第三方授权token，可无

    //手机验证码登录
    private String code;//验证码

    //登录改造字段
    private boolean skipBind = false;//是否跳过绑定，默认不跳过绑定
    private String nickeName;
    private String displayImage;
    private String sex;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getOpenIdSource() {
        return openIdSource;
    }

    public void setOpenIdSource(String openIdSource) {
        this.openIdSource = openIdSource;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSkipBind() {
        return skipBind;
    }

    public void setSkipBind(boolean skipBind) {
        this.skipBind = skipBind;
    }

    public String getNickeName() {
        return nickeName;
    }

    public void setNickeName(String nickeName) {
        this.nickeName = nickeName;
    }

    public String getDisplayImage() {
        return displayImage;
    }

    public void setDisplayImage(String displayImage) {
        this.displayImage = displayImage;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
