package concreteComponent;

import component.Learn;

/**
 * @see ʵ����ѧϰ�ӿڵ�ѧ��,�����Ǳ������ߵĽ�ɫ
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
		System.out.println(name + "ѧ���˼���:");
	}

}
