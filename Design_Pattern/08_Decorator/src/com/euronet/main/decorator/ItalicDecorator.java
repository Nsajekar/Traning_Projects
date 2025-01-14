package com.euronet.main.decorator;

import com.euronet.main.domain.Format;

public class ItalicDecorator implements Format {
private Format format;

	public ItalicDecorator(Format format) {
	this.format = format;
}

	@Override
	public String doFormat() {
		return "Italic " +format.doFormat()+" Italic" ;
	}

}
