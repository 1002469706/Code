package implementation;

import java.util.ArrayList;
import java.util.List;

import abstraction.File;

/**
 * @see ����������ʵ������ɾ���������ļ����ļ��� Ψһ���԰��������ļ����ļ�
 * @author Thornhill
 *
 */
public class Folder extends File {
	private List<File> list = new ArrayList<>();

	public Folder(String name) {
		this.name = name;
	}

	@Override
	public void showSelf(int i) {
		super.showSelf(i);
		System.out.println("�ļ��У�" + name);
		for (File file : list) {
			file.showSelf(i + 1);
		}
	}

	@Override
	public void add(File f) {
		list.add(f);
	}

	@Override
	public void remove(File f) {
		list.remove(f);
	}

	@Override
	public List<File> getChild() {
		return list;
	}

}
