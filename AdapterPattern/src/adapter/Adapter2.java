package adapter;

import phone.Voltage5V;
import powerSupply.Voltage220V;
/**
 * @see	��������ģʽ������ һ���࣬ʵ����ӿڣ�������䡣
 * @author Thornhill
 *
 */
public class Adapter2 implements Voltage5V {
	private Voltage220V voltage220V = new Voltage220V();

	@Override
	public void output5V() {
		System.out.println("���" + voltage220V.VOLTAGE / 44 + "V��ѹ");
	}

}
