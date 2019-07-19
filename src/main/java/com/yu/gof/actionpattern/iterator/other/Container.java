package com.yu.gof.actionpattern.iterator.other;

/**
 * 容器接口
 */
public interface Container {

	public Iterator getIterator();
	
	public void add(Object object);

	public Object get(int index);

	public int size();
}
