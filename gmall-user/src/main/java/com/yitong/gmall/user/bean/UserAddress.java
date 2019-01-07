package com.yitong.gmall.user.bean;

import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "user_address")
@Alias(value = "userAddress")
public class UserAddress implements Serializable{
    private static final long serialVersionUID = -4598936929315554832L;
    /**
     * 用户地址ID
     */
    private String id;

    /**
     * 用户收货地址
     */
    @Column(name = "user_address")
    private String userAddress;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 收件人
     */
    private String consignee;

    /**
     * 联系方式
     */
    @Column(name = "phone_num")
    private String phoneNum;

    /**
     * 是否启用
     */
    @Column(name = "is_default")
    private Boolean isDefault;

    public UserAddress() {
    }

    public UserAddress(String id, String userAddress, String userId, String consignee, String phoneNum, Boolean isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id='" + id + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userId='" + userId + '\'' +
                ", consignee='" + consignee + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", isDefault=" + isDefault +
                '}';
    }
}
