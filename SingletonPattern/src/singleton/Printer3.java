package singleton;

/**
 * 
 * @author Thornhill
 * 3、饿汉式
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 */
public class Printer3 {
	private static Printer3 printer = new Printer3();

	private Printer3() {};

	public static Printer3 getPrinter() {
		return printer;
	}
}
