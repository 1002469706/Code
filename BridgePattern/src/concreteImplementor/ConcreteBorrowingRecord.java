package concreteImplementor;

import abstraction.BorrowingRecords;
import implementor.book.BookAPI;
import implementor.date.DateAPI;
import implementor.user.UserAPI;

/**
 * @see ʵ���Ž�ʵ����
 * @author Thornhill
 *
 */
public class ConcreteBorrowingRecord extends BorrowingRecords {

	public ConcreteBorrowingRecord(UserAPI userAPI, DateAPI dateAPI, BookAPI bookAPI) {
		this.userAPI = userAPI;
		this.dateAPI = dateAPI;
		this.bookAPI = bookAPI;
	}

	@Override
	public void printRecords() {
		super.userAPI.printUser();
		System.out.print("��");
		super.dateAPI.printDate();
		System.out.print("���˱��Ϊ:");
		super.bookAPI.printBookID();
		System.out.println("����");
	}

}
