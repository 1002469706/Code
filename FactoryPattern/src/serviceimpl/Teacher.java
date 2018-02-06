package serviceimpl;

import service.Human;

public class Teacher implements Human {

	private Integer salary = 1024;

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public void showIdentity() {
		System.out.println("我是老师");

	}

	@Override
	public void showWorkContent() {
		System.out.println("教书即可");

	}

	@Override
	public void showSalary() {
		System.out.println("工资：" + salary);

	}

	@Override
	public void showSelf() {
		showIdentity();
		showWorkContent();
		showSalary();

	}

}
