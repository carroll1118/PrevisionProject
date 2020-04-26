package com.it666.domain;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Transaction {
    private Integer trans_id;
    private Date date_of_issue;
    private Date due_data;
    private Integer user_id;
    private Integer book_id;
	@Override
	public String toString() {
		return "Transaction [trans_id=" + trans_id + ", date_of_issue=" + date_of_issue + ", due_data=" + due_data
				+ ", user_id=" + user_id + ", book_id=" + book_id + "]";
	}
    
}
