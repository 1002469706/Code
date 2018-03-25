package facaded;

import java.util.ArrayList;
import java.util.List;

import subfunction.Clean;
import subfunction.Cooking;
import subfunction.Groceries;

/**
 * @see ���߳�ʦ�������εײ�ʵ�֣���ʦ֪����ʲô�ˣ���ô������
 * @author Thornhill
 *
 */
public class Chef {
	public void cooking(String foodName) {
		List<String> names = new ArrayList<>();
		switch (foodName) {
		case "����������":
			names.add("����");
			names.add("������");

			break;
		case "������˿":
			names.add("��");
			names.add("��");
			break;
		default:
			System.out.println("���ĳ�ʦ��ʱ��֧�ִ˹���");
			return;
		// break;
		}
		Groceries groceries = new Groceries(names);
		// ��ɹ���
		groceries.buy();

		Clean clean = new Clean();
		// �����ϴ
		clean.clean(names);

		Cooking cooking = new Cooking();
		// ������
		cooking.cooking(names, foodName);
	}
}
