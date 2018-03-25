package subfunction;

import java.util.List;

/**
 * @see 做饭第一步，根据目标买菜
 * @author Thornhill
 *
 */
public class Groceries {
	private List<String> names;

	public Groceries(List<String> names) {
		this.names = names;
	}

	public void buy() {
		System.out.println("买了" + names + "菜");
	}

	// 定义包可见即可
	List<String> getNames() {
		return names;
	}
}
