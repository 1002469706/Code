package director;

import builder.EssayBuilder;
import product.ChickenSoup;

/**
 * 
 * @author Thornhill
 * @see ���þ����������ġ����ݡ���
 */
public class EssayDirector {
	public ChickenSoup getFinalEssay(EssayBuilder eb) {
		eb.setEssayObject();
		eb.setEssayPredicate();
		eb.setEssaySubject();
		return eb.getEssay();
	}
}
