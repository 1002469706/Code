package concreteBuilder;

import builder.EssayBuilder;
import formation.object.Difficult;
import formation.predicate.IsNot;
import formation.sbuject.Coding;
import product.ChickenSoup;

/**
 * 
 * @author Thornhill
 * @see 构造“编程不难”的具体生成器
 */
public class CodingIsNotDiffcult implements EssayBuilder {

	private ChickenSoup chickenSoup = new ChickenSoup();

	@Override
	public void setEssaySubject() {
		chickenSoup.setSubject(new Coding());

	}

	@Override
	public void setEssayPredicate() {
		chickenSoup.setPredicate(new IsNot());

	}

	@Override
	public void setEssayObject() {
		chickenSoup.setObject(new Difficult());

	}

	@Override
	public ChickenSoup getEssay() {
		return chickenSoup;
	}

}
