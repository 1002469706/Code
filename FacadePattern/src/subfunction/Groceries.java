package subfunction;

import java.util.List;

/**
 * @see ������һ��������Ŀ�����
 * @author Thornhill
 *
 */
public class Groceries {
	private List<String> names;

	public Groceries(List<String> names) {
		this.names = names;
	}

	public void buy() {
		System.out.println("����" + names + "��");
	}

	// ������ɼ�����
	List<String> getNames() {
		return names;
	}
}
