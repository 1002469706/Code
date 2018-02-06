package test;

import factory.*;
import service.*;
import serviceimpl.*;

public class Test {

	public static void main(String[] args) {
		
		/*
		Programmer programmer =  (Programmer) HumenFactory0.getHumen(HumenFactory0.PROGRAMMER);
		Student student =  (Student) HumenFactory0.getHumen(HumenFactory0.STUDENT);
		Teacher teacher =  (Teacher) HumenFactory0.getHumen(HumenFactory0.TRACHER);
		
		programmer.setSalary(2048);
		student.setSalary(2048);
		teacher.setSalary(2048);
		
		
		programmer.showSelf();
		student.showSelf();
		teacher.showSelf();
		
		*/
		/*
		Programmer programmer1 =  HumanFactory1.getClass(Programmer.class);
		Student student1 =   HumanFactory1.getClass(Student.class);
		Teacher teacher1 =  HumanFactory1.getClass(Teacher.class);
		
		programmer1.setSalary(4096);
		student1.setSalary(4096);
		teacher1.setSalary(4096);
		
		
		programmer1.showSelf();
		student1.showSelf();
		teacher1.showSelf();
		
		*/
		Programmer programmer2 =  HumanFactory2.getProgrammer();
		Student student2 =   HumanFactory2.getStudent();
		Teacher teacher2 =  HumanFactory2.getTeacher();
		
		programmer2.setSalary(8192);
		student2.setSalary(8192);
		teacher2.setSalary(8192);
		
		
		programmer2.showSelf();
		student2.showSelf();
		teacher2.showSelf();
		
		
		
		

	}

}
