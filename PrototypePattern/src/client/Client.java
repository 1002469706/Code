package client;

import concretePrototype.MuscleCells;
import prototype.Splittable;
import prototypeManager.CellsManager;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		/**
		 * ����һ������ϸ�����ŵ�ԭ�͹�����
		 */
		Splittable cell = new MuscleCells("�����", "�Ŷ�ͷ��");
		CellsManager.putCells("����ϸ��", cell);
		cell.showSelf();
		/**
		 * ���ڻ���Ҫһ������ϸ�������ң��������֣�������һ�������Ǿ�ʹ�ÿ�¡
		 */
		MuscleCells cell1 = (MuscleCells) CellsManager.getCells("����ϸ��").clone();
		cell1.setCellName("������");
		cell1.showSelf();
	}

}
