package com.yu.gof.createpattern.builder2;

public class TestMain {
	
	public static void main(String[] args) {
		ConcreteBuilder b = new ConcreteBuilder();
		Director d = new Director();
		
		Product p = d.create(b);
		System.out.println(p.toString());
		
		
		ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Product build = concreteBuilder
               .bulidA("牛肉煲")
               .bulidC("全家桶")
               .bulidD("冰淇淋")
               .build();
       System.out.println(build.toString());
	}

}
