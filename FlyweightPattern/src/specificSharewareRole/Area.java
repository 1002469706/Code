package specificSharewareRole;

import abstractSharewareRole.AbsArea;

/**
 * ��ΪҪʹ����Ԫģʽ����ֹ����HashMap�е�Ԫ�ر��ƻ�������AREANAME��ҪΪprivate+final��ȷ�����ᱻ�޸�
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
		System.out.println("�������ڵ�Ϊ" + AREANAME);

	}

}
