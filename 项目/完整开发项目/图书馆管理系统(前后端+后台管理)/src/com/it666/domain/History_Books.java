package com.it666.domain;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class History_Books {
   private Integer	history_book_id;
   private Integer	use_id;
   private Integer book_id;
   private Integer cid;
@Override
public String toString() {
	return "History_Books [history_book_id=" + history_book_id + ", use_id=" + use_id + ", book_id=" + book_id
			+ ", cid=" + cid + "]";
}
   
}
