package com.yu.gof.p2.f1.impl;

import com.yu.gof.p2.f1.ISender;

public class MessageSender implements ISender{

	@Override
	public void send() {
		 System.out.println("this is message sender!");
	}

}
