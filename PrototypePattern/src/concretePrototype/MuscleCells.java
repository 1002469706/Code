package concretePrototype;

import prototype.Splittable;

/**
 * @see ¼¡ÈâÏ¸°û
 * @author Thornhill
 *
 */
public class MuscleCells implements Splittable {

	private String cellType = "¼¡ÈâÏ¸°û";
	private String cellName;
	private String cellLocation;

	public MuscleCells(String cellName, String cellLocation) {
		this.cellName = cellName;
		this.cellLocation = cellLocation;
	}

	public Splittable clone() {
		return new MuscleCells(cellName, cellLocation);
	}

	public String getCellName() {
		return cellName;
	}

	public void setCellName(String cellName) {
		this.cellName = cellName;
	}

	public String getCellLocation() {
		return cellLocation;
	}

	public void setCellLocation(String cellLocation) {
		this.cellLocation = cellLocation;
	}

	@Override
	public void showSelf() {
		System.out.println(cellType + " " + cellName + " " + cellLocation);
	}
}
