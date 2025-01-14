package com.euronet.main.thread;

import com.euronet.main.domain.Call;

;
public class Caller implements Runnable {
	private String messages;
	private Call call;
	private Thread thread;

	@Override
	public void run() {
		call.message(messages);
	}

	public Caller(String messages, Call call) {
		super();
		this.messages = messages;
		this.call = call;
		this.thread = thread;
		thread = new Thread(this);
		thread.start();
	}

}
