package singleton;

/**
 * 
 * @author Thornhill
 * 4、双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 */
public class Printer4 {
	private static Printer4 printer = null;

	private Printer4() {};

	public static Printer4 getPrinter() {
		if (null == printer) {
			synchronized (Printer4.class) {
				if (null == printer) {
					printer = new Printer4();
				}
			}
		}
		return printer;
	}
}
