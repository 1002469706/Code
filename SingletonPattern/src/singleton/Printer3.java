package singleton;

/**
 * 
 * @author Thornhill
 * 3������ʽ
 * �Ƿ� Lazy ��ʼ������
 * �Ƿ���̰߳�ȫ����
 * ʵ���Ѷȣ���
 */
public class Printer3 {
	private static Printer3 printer = new Printer3();

	private Printer3() {};

	public static Printer3 getPrinter() {
		return printer;
	}
}
