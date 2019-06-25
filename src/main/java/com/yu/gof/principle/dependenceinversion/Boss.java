package com.yu.gof.principle.dependenceinversion;

/**
 * 依赖倒置原则
 * 
 * 要实现依赖倒置原则，要有『面向接口编程』这个思维，掌握好这个思维后，就可以很好的运用依赖倒置原则
 * 
 * 一个小村里，有两家饭馆，虽然挂着不同的牌子，挨在一起，但是老板确是表兄弟。这两兄弟抠得很，为了节省成本，
 * 密谋了一个想法：在两家饭馆谁家忙的时候，可以让不忙的那家的员工过去支援一下。
 * 这样子，本来每家饭馆都需要 2 个洗碗工，总共需要 4 个，他们就只招了 3 个，省了 1 个洗碗工的成本，
 * 当然不止洗碗工，还有服务员等等。两兄弟约定了规则：
 * 1. A 饭馆需要支援的时候，B 饭馆老板，让 B 饭馆老板选哪个员工去支援，不能直接让 A饭馆的员工直接找B饭馆的员工去帮忙，
 *    但可以让 A 饭馆员工找 B饭馆老板告知需要支援。
 * 2. 虽然老板权利大，但是也不能说 A 饭馆老板直接叫 B 饭馆的员工去帮忙。
 * 3. 员工没有真实的老板，今天为 A 饭馆工作就是 A 饭馆的员工，没有跟定哪个老板。
 * 
 * @author Super Yu
 *
 */
abstract class Boss {
	
	private Stuff stuff;
	
	public Boss(Stuff stuff){
		this.stuff = stuff;
	}
	
	/**
	 * 提供支援（派某个员工去支援）
	 */
	abstract void support();
	
	/**
	 * 请求支援（向哪个老板请求支援）
	 * @param boss
	 */
	abstract void askHelp(Boss boss);

	
	public Stuff getStuff() {
		return stuff;
	}

	public void setStuff(Stuff stuff) {
		this.stuff = stuff;
	}

}
