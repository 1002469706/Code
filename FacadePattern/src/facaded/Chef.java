package facaded;

import java.util.ArrayList;
import java.util.List;

import subfunction.Clean;
import subfunction.Cooking;
import subfunction.Groceries;

/**
 * @see 告诉厨师，将屏蔽底层实现，厨师知道买什么菜，怎么做饭。
 * @author Thornhill
 *
 */
public class Chef {
	public void cooking(String foodName) {
		List<String> names = new ArrayList<>();
		switch (foodName) {
		case "西红柿鸡蛋":
			names.add("鸡蛋");
			names.add("西红柿");

			break;
		case "京酱肉丝":
			names.add("肉");
			names.add("葱");
			break;
		default:
			System.out.println("您的厨师暂时不支持此功能");
			return;
		// break;
		}
		Groceries groceries = new Groceries(names);
		// 完成购买
		groceries.buy();

		Clean clean = new Clean();
		// 完成清洗
		clean.clean(names);

		Cooking cooking = new Cooking();
		// 完成烹饪
		cooking.cooking(names, foodName);
	}
}
