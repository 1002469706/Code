package client;

import concretePrototype.MuscleCells;
import prototype.Splittable;
import prototypeManager.CellsManager;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		/**
		 * 创建一个肌肉细胞，放到原型管理中
		 */
		Splittable cell = new MuscleCells("肌肉甲", "肱二头肌");
		CellsManager.putCells("肌肉细胞", cell);
		cell.showSelf();
		/**
		 * 现在还需要一个肌肉细胞肌肉乙，除了名字，其他都一样，我们就使用克隆
		 */
		MuscleCells cell1 = (MuscleCells) CellsManager.getCells("肌肉细胞").clone();
		cell1.setCellName("肌肉乙");
		cell1.showSelf();
	}

}
