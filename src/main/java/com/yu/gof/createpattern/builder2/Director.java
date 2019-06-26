package com.yu.gof.createpattern.builder2;

public class Director {

	public Product create(Builder builder) {
        builder.bulidA("汉堡");
        builder.bulidB("薯条");
        builder.bulidC("可乐");
        return builder.build();
    }
}
