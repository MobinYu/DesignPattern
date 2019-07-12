package com.yu.gof.actionpattern.templatemethod;

public abstract class HouseTemplate {
	
	//模板方法，定义了在建造房子过程中一系列方法的执行顺序，final类型不让子类重写
	public final void buildHouse() {
		buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
	}

	private void buildFoundation() {
		System.out.println("Building foundation with cement,iron rods and sand");
	}
	
	public abstract void buildWindows();

    public abstract void buildWalls();

    public abstract void buildPillars();

}
