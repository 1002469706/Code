package concreteComponent;

import component.Learn;

/**
 * @see 实现了学习接口的学生,这里是被修饰者的角色
 * @author Thornhill
 *
 */
public class Student implements Learn {

	private String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public void learnSkills() {
		System.out.println(name + "学会了技能:");
	}

}
