package com.yu.study.designpattern.p1;

/**
 * 懒汉式(线程安全，同步方法)[不推荐用]
 * 对getInstance()方法进行了线程同步
 * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步代码块，方法进行同步效率太低。
 * 
 * @author Super Yu
 *
 */
public class Singleton2 {
	
	private static Singleton2 singleton;

    private Singleton2() {}

    public static synchronized Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }

}
