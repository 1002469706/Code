package prototypeManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Spliterator;

import prototype.Splittable;

public class CellsManager {
	private static Map<String, Splittable> map = new HashMap<String, Splittable>();

	private CellsManager() {
	};

	public static Splittable getCells(String cellType) {
		Splittable cell = map.get(cellType);
		return cell;
	}

	public static void putCells(String cellType, Splittable cell) {
		map.put(cellType, cell);
	}

	public static void removeCells(String cellType) {
		map.remove(cellType);
	}
}
