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
		System.out.println("����ѧ��");

	}

	@Override
	public void showWorkContent() {
		System.out.println("����");

	}

	@Override
	public void showSalary() {
		System.out.println("����NuN");

	}

	@Override
	public void showSelf() {
		showIdentity();
		showWorkContent();
		showSalary();

	}

}
