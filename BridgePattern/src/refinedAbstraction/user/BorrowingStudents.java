package refinedAbstraction.user;

import implementor.user.UserAPI;

/**
 * @see 借书者的学生具体实现类（体现多态）
 * @author Thornhill
 *
 */
public class BorrowingStudents implements UserAPI {

	private String studentID;

	public BorrowingStudents(String studentID) {
		this.studentID = studentID;
	}

	@Override
	public void printUser() {
		System.out.print("学生:" + studentID);
	}

}
