package com.yu.gof.p2.f1;

import com.yu.gof.p2.f1.impl.MailSender;
import com.yu.gof.p2.f1.impl.MessageSender;

public class SendFactory {
	
	public static ISender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		}
		else if ("mess".equals(type)){
			return new MessageSender();
		}
		else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
	
	public static void main(String[] args) {
		ISender sender = produce("mail");
		
		sender.send();
	}

}
