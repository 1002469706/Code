package specificSharewareRole;

import abstractSharewareRole.AbsArea;

/**
 * 因为要使用享元模式，防止放在HashMap中的元素被破坏，其中AREANAME需要为private+final，确保不会被修改
 * @author Thornhill
 *
 */
public class Area implements AbsArea {
	final private String AREANAME;

	public Area(String AREANAME) {
		this.AREANAME = AREANAME;
	}

	@Override
	public void shwo() {
		System.out.println("户籍所在地为" + AREANAME);

	}

}
