package com.yu.gof.structurepattern.facade;

/**
 * -未使用外观模式，需求人员要分别和开发、测试打交道
 */
public class TestMain2 {

	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.processDemand("根据天气变换手机壳颜色");
	}

}
