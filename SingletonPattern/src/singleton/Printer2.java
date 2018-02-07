package singleton;

/**
 * 
 * @author Thornhill
 * 2������ʽ���̰߳�ȫ
 * �Ƿ� Lazy ��ʼ������
 * �Ƿ���̰߳�ȫ����
 * ʵ���Ѷȣ���
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
