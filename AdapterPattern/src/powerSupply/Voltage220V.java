package powerSupply;

/**
 * @see 提供原始电压，220V
 * @author Thornhill
 *
 */
public class Voltage220V {
	public final Integer VOLTAGE = 220;

	public void output220V() {
		System.out.println("输出" + VOLTAGE + "V电压");
	}
}
