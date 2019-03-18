package com.yu.gof.p1;

/**
 * 饿汉式（静态常量）[可用]
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 * 
 * @author Super Yu
 *
 */
public class Singleton {
	
	private final static Singleton instance = new Singleton();
	
	private Singleton() {}

	public static Singleton getInstance(){
		return instance;
	}
}

/**
 * 将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
 */
/*public class Singleton {
	
	private static Singleton instance;

    static {
        instance = new Singleton();
    }
	
	private Singleton() {}

	public static Singleton getInstance(){
		return instance;
	}
}*/