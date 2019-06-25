package com.yu.study.designpattern.p2.f1;

import com.yu.study.designpattern.p2.f1.impl.BenzCar;
import com.yu.study.designpattern.p2.f1.impl.BugattiCar;

/**
 * 简单工厂模式
 * 静态工厂
 * @author Super Yu
 *
 */
public class CarFactory {
	
	public static ICar produceCar(String type) {
		if ("benz".equals(type)) {
			return new BenzCar();
		}
		else if ("bugatti".equals(type)){
			return new BugattiCar();
		}
		else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}

}
