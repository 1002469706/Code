package decorator;

import component.Learn;

/**
 * @see װ���ߵĻ��࣬����һ��ѧϰ�߶��󣬱�װ��ʱ����һ��ѧϰ����
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
