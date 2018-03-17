package refinedAbstraction.date;

import java.util.Date;

import implementor.date.DateAPI;

public class BorrowingDate implements DateAPI {

	private String date;

	public BorrowingDate(String date) {
		this.date = date;
	}

	@Override
	public void printDate() {
		System.out.print(date);
	}

}
