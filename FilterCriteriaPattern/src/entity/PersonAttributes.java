package entity;

/**
 * @see Person类中可选的属性
 * @author Thornhill
 *
 */
public enum PersonAttributes {
	男, 女, 医生, 程序员;
	private PersonAttributes() {
	}

	public static PersonAttributes getMale() {
		return 男;
	}

	public static PersonAttributes getFemale() {
		return 女;
	}

	public static PersonAttributes getProgrammer() {
		return 程序员;
	}

	public static PersonAttributes getDoctor() {
		return PersonAttributes.医生;
	}

}
