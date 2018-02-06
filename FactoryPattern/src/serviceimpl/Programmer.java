package serviceimpl;

import service.Human;

public class Programmer implements Human {

	private Integer salary = 1024;

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public void showIdentity() {
		System.out.println("我是程序员");
	}

	@Override
	public void showWorkContent() {
		System.out.println("996CODING，懂得自然懂");
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
