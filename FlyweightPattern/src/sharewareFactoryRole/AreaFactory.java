package sharewareFactoryRole;

import java.util.HashMap;
import java.util.Map;

import abstractSharewareRole.AbsArea;
import specificSharewareRole.Area;

/**
 * 享元模式工厂，持有一个MAP，调用时检查MAP中是否持有现有对象 
 * 如果有，直接返回此对象
 * 没有，加入到MAP中，并返回此对象
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
