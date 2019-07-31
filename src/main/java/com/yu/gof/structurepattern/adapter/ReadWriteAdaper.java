package com.yu.gof.structurepattern.adapter;

/**
 * -适配器
 */
public class ReadWriteAdaper implements Target {

	private Laptop laptop;
	
	public ReadWriteAdaper(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public void readAndWriteMicroSDCard() {
		System.out.println("使用读卡器");
		laptop.readAndWrite();
	}

}
