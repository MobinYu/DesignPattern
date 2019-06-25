package com.yu.study.designpattern.p1;

/**
 * 静态内部类[推荐用]
 * 静态内部类方式在需要实例化对象时，调用getInstance方法，装载SingletonInstance类，完成Singleton的实例化。
 * 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 * 优点：避免了线程不安全，延迟加载，效率高。
 * 
 * @author Super Yu
 *
 */
public class Singleton4 {

	private Singleton4() {}

    private static class SingletonInstance {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

