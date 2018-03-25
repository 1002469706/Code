package client;

import facaded.Chef;

/**
 * @see 任性的用户只需要提出需求使用即可，不需要关注具体的实现细节
 * @author Thornhill
 *
 */
public class User {

	public static void main(String[] args) {
		Chef chef = new Chef();
		// 把想吃的菜告诉厨师
		chef.cooking("西红柿鸡蛋");
		chef.cooking("京酱肉丝");
		chef.cooking("满汉全席");
	}

}
