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
		System.out.println("���ǳ���Ա");
	}

	@Override
	public void showWorkContent() {
		System.out.println("996CODING��������Ȼ��");
	}

	@Override
	public void showSalary() {
		System.out.println("���ʣ�" + salary);

	}

	@Override
	public void showSelf() {
		showIdentity();
		showWorkContent();
		showSalary();

	}

}
