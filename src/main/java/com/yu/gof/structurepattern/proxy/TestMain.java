package com.yu.gof.structurepattern.proxy;

public class TestMain {

	public static void main(String[] args) {
		ProxyInternet proxyInternet = new ProxyInternet(new GlobalInternet());
		
		proxyInternet.access("www.baidu.com");
		proxyInternet.access("www.google.com");
	}
}
