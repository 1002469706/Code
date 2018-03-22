package abstraction;

import java.util.List;

/**
 * @see 透明组合模式，定义文件系统每个组件的所有功能， 并且提供了默认的无服务的方法
 * @author Thornhill
 *
 */
public abstract class File {
	protected String name;

	public void showSelf(int i) {
		// 根据递归深度调整输出格式
		while (i > 0) {
			System.out.print("	");
			i--;
		}
	}

	public void add(File f) {
		System.out.println("该文件不支持添加节点操作");
	}

	public void remove(File f) {
		System.out.println("该文件不支持移除节点操作");
	}

	public List<File> getChild() {
		System.out.println("该节点不支持获取子节点操作");
		return null;
	}
}
