package client;

import abstraction.BorrowingRecords;
import concreteImplementor.ConcreteBorrowingRecord;
import refinedAbstraction.book.BorrowedBook;
import refinedAbstraction.date.BorrowingDate;
import refinedAbstraction.user.BorrowingStudents;
import refinedAbstraction.user.BorrowingTeacher;

/**
 * @see �Ž���ͻ��ˣ��������
 * @author Thornhill
 *
 */
public class BridgePatternDemo {

	public static void main(String[] args) {

		BorrowingRecords borrowingRecords1 = new ConcreteBorrowingRecord(new BorrowingStudents("65535"),
				new BorrowingDate("2018��3��17��"), new BorrowedBook("1024"));
		borrowingRecords1.printRecords();
		BorrowingRecords borrowingRecords2 = new ConcreteBorrowingRecord(new BorrowingTeacher("65536"),
				new BorrowingDate("2018��3��18��"), new BorrowedBook("1025"));
		borrowingRecords2.printRecords();

	}

}
