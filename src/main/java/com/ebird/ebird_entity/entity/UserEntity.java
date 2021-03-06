package com.ebird.ebird_entity.entity;

import java.io.Serializable;
import java.util.Date;

public class UserEntity implements Serializable{
	
	private static final long serialVersionUID = -482262390418753384L;

	public Integer id;
	
	public String username ;
	
	public String password ;
	
	public String avatar;//用户头像地址
	
	public String email;
	
	public String telphone;
	
	public String birthday;
	
	public Integer degree;
	
	public Date registerTime;
	
	public Date lastloginTime;
	
	public String remark;
	
	public Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getDegree() {
		return degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Date getLastloginTime() {
		return lastloginTime;
	}

	public void setLastloginTime(Date lastloginTime) {
		this.lastloginTime = lastloginTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
