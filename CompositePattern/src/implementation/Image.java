package implementation;

import abstraction.File;

/**
 * @see ͼƬ�ļ����������ṩ����ɾ������������ʹ�ø���Ĭ�Ϸ������ɡ�
 * @author Thornhill
 *
 */
public class Image extends File {
	public Image(String name) {
		this.name = name;
	}

	@Override
	public void showSelf(int i) {
		super.showSelf(i);
		System.out.println("ͼƬ�ļ�:" + name);

	}

}
