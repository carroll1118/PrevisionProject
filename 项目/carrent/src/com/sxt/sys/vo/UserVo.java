package com.sxt.sys.vo;

import com.sxt.sys.domain.User;

public class UserVo extends User {

	/**
	 * 鍒嗛〉鍙傛暟
	 */
	private Integer page;
	private Integer limit;

	// 鎺ユ敹澶氫釜瑙掕壊id
	private Integer[] ids;

	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

}
