package com.it666.domain;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Bill {
     private Integer bill_id;
     private Date date;
     private Integer user_id;
     private Double amount;
	@Override
	public String toString() {
		return "Bill [bill_id=" + bill_id + ", date=" + date + ", user_id=" + user_id + ", amount=" + amount + "]";
	}
     
}
