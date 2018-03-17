package refinedAbstraction.book;

import implementor.book.BookAPI;

public class BorrowedBook implements BookAPI {

	private String bookID;

	public BorrowedBook(String bookID) {
		this.bookID = bookID;
	}

	@Override
	public void printBookID() {
		System.out.print(bookID);
	}

}
