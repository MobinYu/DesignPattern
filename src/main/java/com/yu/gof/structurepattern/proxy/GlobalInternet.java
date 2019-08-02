package com.yu.gof.structurepattern.proxy;

/**
 * -全球网络
 */
public class GlobalInternet implements Internet {

	@Override
	public String access(String domain) {
		System.out.println("访问网站：" + domain);
		return domain + "网站内容";
	}

}
