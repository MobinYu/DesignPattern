package com.yu.gof.actionpattern.observer.other;

public class TestMain {

	public static void main(String[] args) {
		User xiaoli = new User("小李");
		User xiaosun = new User("小孙");
		User xiaozhao = new User("小赵");
		
		xiaoli.addObserver(xiaosun);
		xiaoli.addObserver(xiaozhao);
		
		xiaoli.sendMessage("见天天气很好，要去游山玩水！");
		
		
		xiaosun.addObserver(xiaozhao);
		xiaosun.addObserver(xiaoli);
		xiaosun.sendMessage("山林里的空气真新鲜！");
		
		System.out.println("=== 小孙和小赵吵架了，屏蔽了小赵。。。 ===");
		xiaosun.removerObserver(xiaozhao);
		xiaosun.sendMessage("再也不和小赵玩了！");

	}

}
