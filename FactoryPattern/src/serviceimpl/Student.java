package serviceimpl;

import service.Human;

public class Student implements Human {

	private Integer salary = 0;

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public void showIdentity() {
		System.out.println("我是学生");

	}

	@Override
	public void showWorkContent() {
		System.out.println("念书");

	}

	@Override
	public void showSalary() {
		System.out.println("工资NuN");

	}

	@Override
	public void showSelf() {
		showIdentity();
		showWorkContent();
		showSalary();

	}

}
