package com.Request;

import java.util.Arrays;

public class User {
       private String  username;
       private String  pwd;
       private String  gender;
       private String[]  hobby;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", pwd=" + pwd + ", gender=" + gender + ", hobby="
				+ Arrays.toString(hobby) + "]";
	}
       
       
       
}
