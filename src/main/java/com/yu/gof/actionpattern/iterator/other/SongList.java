package com.yu.gof.actionpattern.iterator.other;

/**
 * 歌单
 */
public class SongList implements Container {

	private ISong[] songs;
    private int index;
    private int size;
    
    public SongList(int size) {
        this.songs = new ISong[size];
        this.index = 0;
        this.size = 0;
    }
	
	@Override
	public Iterator getIterator() {
		return new IteratorImpl(this);
	}

	@Override
	public void add(Object object) {
		songs[index++] = (ISong) object;
		size ++;
	}

	@Override
	public Object get(int index) {
		if (index < size) {
            return songs[index];
        }
        return null;
	}

	@Override
	public int size() {
		return size;
	}

}
