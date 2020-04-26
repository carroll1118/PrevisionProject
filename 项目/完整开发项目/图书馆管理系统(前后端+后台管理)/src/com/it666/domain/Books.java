package com.it666.domain;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Books {
	private Integer book_id;
	private String  isbn;
	private String  book_name;
	private String  book_author;
	private String  book_price;
	private String  book_nackNo;
	private Integer book_status;
	private String book_edition;
	private String data_storage;
	private String  book_gdesc;
	private Integer  is_host;
	private Integer  cid;
	private String  book_image;
	@Override
	public String toString() {
		return "Books [book_id=" + book_id + ", isbn=" + isbn + ", book_name=" + book_name + ", book_author="
				+ book_author + ", book_price=" + book_price + ", book_nackNo=" + book_nackNo + ", book_status="
				+ book_status + ", book_edition=" + book_edition + ", data_storage=" + data_storage + ", book_gdesc="
				+ book_gdesc + ", is_host=" + is_host + ", cid=" + cid + ", book_image=" + book_image + "]";
	}
	
    
}
