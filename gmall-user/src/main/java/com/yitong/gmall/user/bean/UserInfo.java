package com.yitong.gmall.user.bean;

import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "user_info")
@Alias(value = "userInfo")
public class UserInfo implements Serializable{
    private static final long serialVersionUID = 5465775492730080699L;
    /**
     * 用户ID
     */
    private String id;

    /**
     * 用户账号
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 用户昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 用户密码
     */
    private String passwd;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户手机号码
     */
    @Column(name = "phone_num")
    private String phoneNum;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户头像
     */
    @Column(name = "head_img")
    private String headImg;

    /**
     * 用户等级
     */
    @Column(name = "user_level")
    private String userLevel;

    public UserInfo() {
    }

    public UserInfo(String id, String loginName, String nickName, String passwd, String name, String phoneNum, String email, String headImg, String userLevel) {
        this.id = id;
        this.loginName = loginName;
        this.nickName = nickName;
        this.passwd = passwd;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.headImg = headImg;
        this.userLevel = userLevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", loginName='" + loginName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", passwd='" + passwd + '\'' +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", headImg='" + headImg + '\'' +
                ", userLevel='" + userLevel + '\'' +
                '}';
    }
}
