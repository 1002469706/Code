package singleton;

/**
 * 
 * @author Thornhill
 * 5���Ǽ�ʽ/��̬�ڲ���
 * �Ƿ� Lazy ��ʼ������
 * �Ƿ���̰߳�ȫ����
 * ʵ���Ѷȣ�һ��
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
