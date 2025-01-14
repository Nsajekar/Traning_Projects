package com.euronet.main.decorator;

import com.euronet.main.domain.Format;

public class UnderLIneDecorator implements Format {
private Format format;

	public UnderLIneDecorator(Format format) {
	this.format = format;
}

	@Override
	public String doFormat() {
		return "UnderLine " +format.doFormat()+" UnderLine" ;
	}

}
