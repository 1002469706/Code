package builder;

import product.ChickenSoup;

/**
 * 
 * @author Thornhill
 * @see 鸡汤文章的接口(Builder)
 */
public interface EssayBuilder {

	public void setEssaySubject();

	public void setEssayPredicate();

	public void setEssayObject();

	public ChickenSoup getEssay();
}
