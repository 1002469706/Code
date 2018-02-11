package builder;

import product.ChickenSoup;

/**
 * 
 * @author Thornhill
 * @see �������µĽӿ�(Builder)
 */
public interface EssayBuilder {

	public void setEssaySubject();

	public void setEssayPredicate();

	public void setEssayObject();

	public ChickenSoup getEssay();
}
