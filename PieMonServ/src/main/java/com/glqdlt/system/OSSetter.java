package com.glqdlt.system;

public enum OSSetter {

	windows("EUC-KR", "\\"), linux("UTF8", "/");

	OSSetter(String encoding, String path) {
		this.encoding = encoding;
		this.path = path;

	}

	private String encoding;
	private String path;

	public String getEncoding() {
		return encoding;
	}

	public String getPath() {
		return path;
	}

}
