package implementation;

import java.util.List;

import abstraction.File;

/**
 * @see 文本文件，不真正提供增，删，遍历操作，使用父类默认方法即可。
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
		System.out.println("文本文件:" + name);
	}

}
