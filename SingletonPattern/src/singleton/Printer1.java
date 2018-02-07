package singleton;

/**
 * 
 * @author Thornhill
 * 1、懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 */
public class Printer1 {
	private static Printer1 printer;

	private Printer1() {};

	public static Printer1 getPrinter() {
		if (null != printer) {
			printer = new Printer1();
		}
		return printer;
	}
}
