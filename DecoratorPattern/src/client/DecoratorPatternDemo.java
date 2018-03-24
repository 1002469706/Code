package client;

import component.Learn;
import concreteComponent.Student;
import concreteDecorator.CSkills;
import decorator.Skills;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// ����ѧ����С����
		Learn xiaoming = new Student("С��");
		// ���������ߡ�skills��
		Skills skills = new Skills(xiaoming);
		// �������skill
		// ��ģ��С�����ѧϰ�¼���
		skills = new CSkills(skills, "Java");
		skills = new CSkills(skills, "Python");
		skills = new CSkills(skills, "Hadoop");
		// ���С���ļ���
		skills.learnSkills();

	}

}
