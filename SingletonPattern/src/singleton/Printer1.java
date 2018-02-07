package singleton;

/**
 * 
 * @author Thornhill
 * 1������ʽ���̲߳���ȫ
 * �Ƿ� Lazy ��ʼ������
 * �Ƿ���̰߳�ȫ����
 * ʵ���Ѷȣ���
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
