package refinedAbstraction.user;

import implementor.user.UserAPI;

/**
 * @see �����ߵ���ʦ����ʵ���ࣨ���ֶ�̬��
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
		System.out.print("��ʦ:" + teacherID);
	}

}
