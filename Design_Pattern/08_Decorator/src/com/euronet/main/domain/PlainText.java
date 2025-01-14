package com.euronet.main.domain;

public class PlainText implements Format {
private String text;

public PlainText() {
	// TODO Auto-generated constructor stub
}
	public PlainText(String text) {
	super();
	this.text = text;
}

	@Override
	public String doFormat() {
		return text;
	}

}
