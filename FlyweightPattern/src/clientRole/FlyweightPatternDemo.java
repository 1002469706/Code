package clientRole;

import abstractSharewareRole.AbsArea;
import sharewareFactoryRole.AreaFactory;

public class FlyweightPatternDemo {

	public static void main(String[] args) {
		AbsArea absArea1 = AreaFactory.getArea("内蒙古");
		AbsArea absArea2 = AreaFactory.getArea("内蒙古");
		AbsArea absArea3 = AreaFactory.getArea("广东");
		AbsArea absArea4 = AreaFactory.getArea("重庆");

		absArea1.shwo();
		absArea2.shwo();
		absArea3.shwo();
		absArea4.shwo();

		System.out.println(absArea1 == absArea2);
		System.out.println(absArea3 == absArea4);

	}

}
