package factory;

import service.Human;
import serviceimpl.Programmer;
import serviceimpl.Student;
import serviceimpl.Teacher;

public class HumenFactory0 {
	public static final Integer PROGRAMMER = 0;
	public static final Integer STUDENT = 1;
	public static final Integer TRACHER = 2;

	public static Human getHumen(Integer type) {
		Human human = null;
		switch (type) {
		case 0:
			human = new Programmer();
			break;
		case 1:
			human = new Student();
			break;
		case 2:
			human = new Teacher();
			break;
		default:
			break;
		}
		return human;
	}
}
