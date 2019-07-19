package com.yu.gof.actionpattern.iterator.other;

public class IteratorImpl implements Iterator {

	private Container conlist;
	private int index;
	
	public IteratorImpl(Container conlist) {
		this.conlist = conlist;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if(index < conlist.size()){
            return true;
         }
         return false;
	}

	@Override
	public Object next() {
		if(this.hasNext()){
            return conlist.get(index++);
         }
		return null;
	}

}
