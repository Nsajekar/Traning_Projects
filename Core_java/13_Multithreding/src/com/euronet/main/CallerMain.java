package com.euronet.main;

import com.euronet.main.domain.Call;
import com.euronet.main.thread.Caller;

public class CallerMain {

	public static void main(String[] args) {
		Call call = new Call();
		Caller caller = new Caller("Hi", call);
		Caller caller1 = new Caller("HELLO", call);
		Caller caller12s = new Caller("Bye", call);


	}

}
