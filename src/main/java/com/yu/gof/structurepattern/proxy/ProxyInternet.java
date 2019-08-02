package com.yu.gof.structurepattern.proxy;

import java.util.HashSet;
import java.util.Set;

public class ProxyInternet implements Internet {
	
	private Set<String> disable;

	private Internet internet;

	public ProxyInternet(Internet internet) {
		this.internet = internet;
		this.disable = new HashSet<>();
		this.disable.add("www.google.com");
		this.disable.add("www.youtube.com");
	}
	
	@Override
	public String access(String domain) {
		if (disable.contains(domain)) {
			System.out.println("禁止访问该网站：" + domain);
			return "禁止访问该网站：" + domain;
		}
		return internet.access(domain);
	}

}
