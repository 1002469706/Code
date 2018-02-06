package factory;

import serviceimpl.Programmer;
import serviceimpl.Student;
import serviceimpl.Teacher;

public class HumanFactory2 {
	public static Programmer getProgrammer() {
		return new Programmer();
	}

	public static Student getStudent() {
		return new Student();
	}

	public static Teacher getTeacher() {
		return new Teacher();
	}
}
