package com.it666.domain;

import java.sql.Date;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("unused")
@Setter@Getter
public class User {
	private String user_id;
	private String user_name;
	private String user_password;
	private String user_phone;
	private Integer user_type;
	private Date date_usership;
	private Integer max_book_limit;
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_password=" + user_password
				+ ", user_phone=" + user_phone + ", user_type=" + user_type + ", date_usership=" + date_usership
				+ ", max_book_limit=" + max_book_limit + "]";
	}
}
