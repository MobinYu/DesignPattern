package com.yu.gof.createpattern.factory;

/**
 * -简单工厂模式
 * 
 * @author Administrator
 * @date 2019年6月25日 下午5:05:32
 */
public class SimpleFactory {
	
	public Car produce(String type) {
		if ("Benz".equals(type)) {
			return new BenzCar();
		} else if ("Bmw".equals(type)) {
			return new BmwCar();
		}
		throw new IllegalArgumentException("请输入车类型");
	}

}
