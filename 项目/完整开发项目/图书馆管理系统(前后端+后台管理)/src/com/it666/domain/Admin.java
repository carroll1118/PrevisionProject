package com.it666.domain;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Admin {
	private String admin_id;
	private String username;
	private String password;
	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", username=" + username + ", password=" + password + "]";
	}
    
}
