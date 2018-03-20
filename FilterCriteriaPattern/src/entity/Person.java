package entity;

/**
 * @see �����ֹ��������˵�ʵ��
 * @author Thornhill
 *
 */
public class Person {
	private PersonAttributes gender;
	private PersonAttributes career;
	private String name;

	public Person(String name, PersonAttributes gender, PersonAttributes career) {
		this.name = name;
		this.gender = gender;
		this.career = career;
	}

	/**
	 * @see ��дtoString������ֱ�����
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " " + gender + " " + career);
		return sb.toString();
		// return super.toString();
	}

	public PersonAttributes getGender() {
		return gender;
	}

	public PersonAttributes getCareer() {
		return career;
	}

	public String getName() {
		return name;
	}
}
