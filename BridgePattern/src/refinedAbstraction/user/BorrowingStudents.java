package refinedAbstraction.user;

import implementor.user.UserAPI;

/**
 * @see �����ߵ�ѧ������ʵ���ࣨ���ֶ�̬��
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
		System.out.print("ѧ��:" + studentID);
	}

}
