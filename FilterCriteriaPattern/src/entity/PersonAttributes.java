package entity;

/**
 * @see Person���п�ѡ������
 * @author Thornhill
 *
 */
public enum PersonAttributes {
	��, Ů, ҽ��, ����Ա;
	private PersonAttributes() {
	}

	public static PersonAttributes getMale() {
		return ��;
	}

	public static PersonAttributes getFemale() {
		return Ů;
	}

	public static PersonAttributes getProgrammer() {
		return ����Ա;
	}

	public static PersonAttributes getDoctor() {
		return PersonAttributes.ҽ��;
	}

}
