package singleton;

/**
 * 
 * @author Thornhill
 * 4��˫����/˫��У������DCL���� double-checked locking��
 * JDK �汾��JDK1.5 ��
 * �Ƿ� Lazy ��ʼ������
 * �Ƿ���̰߳�ȫ����
 * ʵ���Ѷȣ��ϸ���
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
