package sharewareFactoryRole;

import java.util.HashMap;
import java.util.Map;

import abstractSharewareRole.AbsArea;
import specificSharewareRole.Area;

/**
 * ��Ԫģʽ����������һ��MAP������ʱ���MAP���Ƿ�������ж��� 
 * ����У�ֱ�ӷ��ش˶���
 * û�У����뵽MAP�У������ش˶���
 * @author Thornhill
 *
 */
public class AreaFactory {
	private static final Map<String, AbsArea> MAP = new HashMap<>();

	public static AbsArea getArea(String AREANAME) {
		AbsArea absArea = MAP.get(AREANAME);
		if (null == absArea) {
			absArea = new Area(AREANAME);
			MAP.put(AREANAME, absArea);
		}
		return absArea;
	}
}
