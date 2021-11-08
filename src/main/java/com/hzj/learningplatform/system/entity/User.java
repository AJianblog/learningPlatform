package com.hzj.learningplatform.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户实体
 * @author hezhijian
 */
@ApiModel(value = "用户实体类")
public class User {
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID", name = "id")
    private String id;
    /**
     * 账户名
     */
    @ApiModelProperty(value = "账户名", name = "account")
    private String account;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码", name = "password")
    private String password;
    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱", name = "email")
    private String email;
    /**
     * 邮箱状态, true: 激活, false: 未激活
     */
    @ApiModelProperty(value = "邮箱状态", name = "emailStatus")
    private String emailStatus;
    /**
     * 账号冻结状态, true: 冻结, false: 未冻结
     */
    @ApiModelProperty(value = "账号冻结状态", name = "freezeStatus")
    private String freezeStatus;

    public User() {
    }

    public User(String id, String account, String password, String email, String emailStatus, String freezeStatus) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.email = email;
        this.emailStatus = emailStatus;
        this.freezeStatus = freezeStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    public String getFreezeStatus() {
        return freezeStatus;
    }

    public void setFreezeStatus(String freezeStatus) {
        this.freezeStatus = freezeStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", emailStatus='" + emailStatus + '\'' +
                ", freezeStatus='" + freezeStatus + '\'' +
                '}';
    }
}
