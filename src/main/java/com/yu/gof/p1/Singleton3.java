package com.yu.gof.p1;

/**
 * 懒汉式(线程安全，双重检查)[推荐用]
 * 双重检查，保证线程安全
 * 实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象。
 * 优点：线程安全；延迟加载；效率较高。
 * 
 * @author Super Yu
 *
 */
public class Singleton3 {
	
	private static volatile Singleton3 singleton; //使用volatile关键字，保证了线程之间变量的可见性

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (singleton == null) {
            synchronized (Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3(); //只要有一个线程实例化对象，该对象对其它线程可见，会直接return
                }
            }
        }
        return singleton;
    }

}
