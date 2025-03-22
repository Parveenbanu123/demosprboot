package com.mph.props;

public class DBConnection {
	private String url;
	private String uname;
	private String pass;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "DBConnection [url=" + url + ", uname=" + uname + ", pass=" + pass + "]";
	}

}
