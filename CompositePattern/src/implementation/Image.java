package implementation;

import abstraction.File;

/**
 * @see 图片文件，不真正提供增，删，遍历操作，使用父类默认方法即可。
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
		System.out.println("图片文件:" + name);

	}

}
