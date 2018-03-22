package implementation;

import java.util.ArrayList;
import java.util.List;

import abstraction.File;

/**
 * @see 真正意义上实现增，删，遍历的文件夹文件， 唯一可以包含其他文件的文件
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
		System.out.println("文件夹：" + name);
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
