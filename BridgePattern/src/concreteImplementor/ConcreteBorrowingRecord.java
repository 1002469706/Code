package concreteImplementor;

import abstraction.BorrowingRecords;
import implementor.book.BookAPI;
import implementor.date.DateAPI;
import implementor.user.UserAPI;

/**
 * @see 实体桥接实现类
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
		System.out.print("在");
		super.dateAPI.printDate();
		System.out.print("借了编号为:");
		super.bookAPI.printBookID();
		System.out.println("的书");
	}

}
