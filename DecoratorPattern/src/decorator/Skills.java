package decorator;

import component.Learn;

/**
 * @see 装饰者的基类，持有一个学习者对象，被装饰时共享一个学习对象
 * @author Thornhill
 *
 */
public class Skills implements Learn {
	private Learn learner;

	public Skills(Learn learner) {
		this.learner = learner;
	}

	@Override
	public void learnSkills() {
		if (learner != null) {
			learner.learnSkills();
		}

	}

}
