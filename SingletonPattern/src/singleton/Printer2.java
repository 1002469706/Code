package singleton;

/**
 * 
 * @author Thornhill
 * 2、懒汉式，线程安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：易
 */
public class Printer2 {
	private static Printer2 printer;

	private Printer2() {}

	public static synchronized Printer2 getPrinter() {
		if (null != printer) {
			printer = new Printer2();
		}
		return printer;
	}
}
