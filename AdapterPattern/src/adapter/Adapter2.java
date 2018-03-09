package adapter;

import phone.Voltage5V;
import powerSupply.Voltage220V;
/**
 * @see	对象适配模式，持有 一个类，实现类接口，完成适配。
 * @author Thornhill
 *
 */
public class Adapter2 implements Voltage5V {
	private Voltage220V voltage220V = new Voltage220V();

	@Override
	public void output5V() {
		System.out.println("输出" + voltage220V.VOLTAGE / 44 + "V电压");
	}

}
