package concreteBuilder;

import builder.EssayBuilder;
import formation.object.Easy;
import formation.predicate.Is;
import formation.sbuject.Cook;
import product.ChickenSoup;

/**
 * 
 * @author Thornhill
 * @see ���조�����򵥡��ľ���������
 */
public class CookingIsEasy implements EssayBuilder {

	private ChickenSoup chickenSoup = new ChickenSoup();

	@Override
	public void setEssaySubject() {
		chickenSoup.setSubject(new Cook());

	}

	@Override
	public void setEssayPredicate() {
		chickenSoup.setPredicate(new Is());
	}

	@Override
	public void setEssayObject() {
		chickenSoup.setObject(new Easy());

	}

	@Override
	public ChickenSoup getEssay() {
		return chickenSoup;
	}

}
