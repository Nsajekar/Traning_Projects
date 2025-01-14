package com.euronet.main.decorator;

import com.euronet.main.domain.Format;

public class BoldDecorator implements Format {
private Format format;

	public BoldDecorator(Format format) {
	this.format = format;
}

	@Override
	public String doFormat() {
		return "Bold " +format.doFormat()+" Bold" ;
	}

}
