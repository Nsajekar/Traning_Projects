package com.euronet.main.domain;

import com.euronet.main.decorator.BoldDecorator;
import com.euronet.main.decorator.ItalicDecorator;

public class Client {

	public static void main(String[] args) {
		String formattedtext = "";
		Format plaintext = new PlainText("Hi");
		formattedtext = plaintext.doFormat();
		System.out.println(formattedtext );
		System.out.println();
		Format boldtext = new BoldDecorator(plaintext);
		formattedtext = boldtext.doFormat();
		System.out.println(formattedtext);
		System.out.println();
		Format italictext = new ItalicDecorator(boldtext);
		formattedtext = italictext.doFormat();
		System.out.println(formattedtext);
	}

}
