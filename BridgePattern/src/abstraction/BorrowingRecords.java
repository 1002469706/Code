package abstraction;

import implementor.book.BookAPI;
import implementor.date.DateAPI;
import implementor.user.UserAPI;
/**
 * @see ≥ÈœÛ«≈Ω”¿‡
 * @author Thornhill
 *
 */
public abstract class BorrowingRecords {
	protected BookAPI bookAPI;
	protected DateAPI dateAPI;
	protected UserAPI userAPI;

	abstract public void printRecords();
}
