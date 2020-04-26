package com.it666.domain;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Info {
	 private Integer info_id;
	 private Integer info_img;
	 private Integer is_host;
	@Override
	public String toString() {
		return "Info [info_id=" + info_id + ", info_img=" + info_img + ", is_host=" + is_host + "]";
	}
	 
}
