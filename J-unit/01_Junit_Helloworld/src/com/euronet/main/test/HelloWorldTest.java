package com.euronet.main.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.euronet.main.domain.Message;

public class HelloWorldTest {
	@Test
	public void testMessage() {
		String message = "Junit is simple";
		assertEquals("Junit is simple", message);
	}

	@Test
	public void testTextMessage() {
		Message message = new Message();
		assertEquals("Euronet Worldwide", message.getMessage());
	}

}
