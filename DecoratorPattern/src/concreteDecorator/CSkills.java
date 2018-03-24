package concreteDecorator;

import component.Learn;
import decorator.Skills;

/**
 * @see ���������߽�ɫ����߲�̳��������ߣ�Sills����Ϊ�˸�ͬһ�������������µķ��������̳����Լ���
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
