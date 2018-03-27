package clientRole;

import abstractSharewareRole.AbsArea;
import sharewareFactoryRole.AreaFactory;

public class FlyweightPatternDemo {

	public static void main(String[] args) {
		AbsArea absArea1 = AreaFactory.getArea("���ɹ�");
		AbsArea absArea2 = AreaFactory.getArea("���ɹ�");
		AbsArea absArea3 = AreaFactory.getArea("�㶫");
		AbsArea absArea4 = AreaFactory.getArea("����");

		absArea1.shwo();
		absArea2.shwo();
		absArea3.shwo();
		absArea4.shwo();

		System.out.println(absArea1 == absArea2);
		System.out.println(absArea3 == absArea4);

	}

}
