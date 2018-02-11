package test;

import builder.EssayBuilder;
import concreteBuilder.CodingIsNotDiffcult;
import concreteBuilder.CookingIsEasy;
import director.EssayDirector;
import product.ChickenSoup;

/**
 * 
 * @author Thornhill
 * @see 建造者模式测试
 */
public class Test {

	public static void main(String[] args) {
		ChickenSoup essay1 = new EssayDirector().getFinalEssay(new CookingIsEasy());
		essay1.showChickenSoup();
		
		ChickenSoup essay2 = new EssayDirector().getFinalEssay(new CodingIsNotDiffcult());
		essay2.showChickenSoup();
		
	}

}
