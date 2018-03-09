package adapter;

import phone.Voltage5V;
import powerSupply.Voltage220V;
/**
 * @see	类适配器模式，继承父类，实现接口，完成适配
 * @author Thornhill
 *
 */
public class Adapter1 extends Voltage220V implements Voltage5V {

	@Override
	public void output5V() {
		System.out.println("输出" + super.VOLTAGE / 44 + "V电压");

	}

}
