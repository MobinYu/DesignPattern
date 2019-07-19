package com.yu.gof.actionpattern.iterator.other;

/**
 * 音乐库
 * @author Administrator
 * @date 2019年7月19日 上午11:45:33
 */
public class SongPool {

	private Container container;

	public SongPool() {
		container = new SongList(3);
		container.add(new Song("十年", "陈奕迅"));
		container.add(new Song("你曾是少年", "SHE"));
		container.add(new Song("Perfect", "Ed Sheeran"));
	}
	
	/**
     * 列表循环
     */
    public void listenToMusicByLoop() {
        Iterator iterator = container.getIterator();
        while (iterator.hasNext()) {
            System.out.println("听歌：" + ((ISong)iterator.next()).getSongInfo());
        }

    }
}
