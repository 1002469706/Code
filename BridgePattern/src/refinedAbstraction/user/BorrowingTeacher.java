package refinedAbstraction.user;

import implementor.user.UserAPI;

/**
 * @see 借书者的老师具体实现类（体现多态）
 * @author Thornhill
 *
 */
public class BorrowingTeacher implements UserAPI {

	private String teacherID;

	public BorrowingTeacher(String teacherID) {
		this.teacherID = teacherID;
	}

	@Override
	public void printUser() {
		System.out.print("老师:" + teacherID);
	}

}
