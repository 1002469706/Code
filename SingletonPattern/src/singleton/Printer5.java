package singleton;

/**
 * 
 * @author Thornhill
 * 5、登记式/静态内部类
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：一般
 */
public class Printer5 {
	private static class Printer5Holder {
		private static final Printer5 PRINTER = new Printer5();
	}

	private Printer5() {
	};

	public static Printer5 getPrinter() {
		return Printer5Holder.PRINTER;
	}
}
