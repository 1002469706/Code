package implementation;

import java.util.List;

import abstraction.File;

/**
 * @see �ı��ļ����������ṩ����ɾ������������ʹ�ø���Ĭ�Ϸ������ɡ�
 * @author Thornhill
 *
 */
public class Txt extends File {
	public Txt(String name) {
		this.name = name;
	}

	@Override
	public void showSelf(int i) {
		super.showSelf(i);
		System.out.println("�ı��ļ�:" + name);
	}

}
