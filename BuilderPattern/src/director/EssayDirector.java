package director;

import builder.EssayBuilder;
import product.ChickenSoup;

/**
 * 
 * @author Thornhill
 * @see 调用具体生成器的“导演”类
 */
public class EssayDirector {
	public ChickenSoup getFinalEssay(EssayBuilder eb) {
		eb.setEssayObject();
		eb.setEssayPredicate();
		eb.setEssaySubject();
		return eb.getEssay();
	}
}
