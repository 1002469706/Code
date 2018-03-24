package concreteDecorator;

import component.Learn;
import decorator.Skills;

/**
 * @see 具体修饰者角色，最高层继承于修饰者（Sills），为了给同一个方法灵活叠加新的方法，多层继承于自己。
 * @author Thornhill
 *
 */
public class CSkills extends Skills {

	private String skillName;

	public CSkills(Learn learner, String skillName) {
		super(learner);
		this.skillName = skillName;
	}

	@Override
	public void learnSkills() {
		super.learnSkills();
		System.out.println("	" + skillName);
	}

}
