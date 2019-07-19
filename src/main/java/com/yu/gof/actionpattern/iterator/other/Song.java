package com.yu.gof.actionpattern.iterator.other;

public class Song implements ISong {

	private String name;
    private String singer;

    public Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }
	
	@Override
	public String getSongInfo() {
		return this.name + "--" + this.singer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

}
