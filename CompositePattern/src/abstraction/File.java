package abstraction;

import java.util.List;

/**
 * @see ͸�����ģʽ�������ļ�ϵͳÿ����������й��ܣ� �����ṩ��Ĭ�ϵ��޷���ķ���
 * @author Thornhill
 *
 */
public abstract class File {
	protected String name;

	public void showSelf(int i) {
		// ���ݵݹ���ȵ��������ʽ
		while (i > 0) {
			System.out.print("	");
			i--;
		}
	}

	public void add(File f) {
		System.out.println("���ļ���֧����ӽڵ����");
	}

	public void remove(File f) {
		System.out.println("���ļ���֧���Ƴ��ڵ����");
	}

	public List<File> getChild() {
		System.out.println("�ýڵ㲻֧�ֻ�ȡ�ӽڵ����");
		return null;
	}
}
