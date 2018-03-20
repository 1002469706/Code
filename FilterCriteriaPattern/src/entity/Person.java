package entity;

/**
 * @see 被各种过滤器过滤的实体
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
	 * @see 重写toString，便于直接输出
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
