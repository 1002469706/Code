package adapter;

import phone.Voltage5V;
import powerSupply.Voltage220V;
/**
 * @see	��������ģʽ���̳и��࣬ʵ�ֽӿڣ��������
 * @author Thornhill
 *
 */
public class Adapter1 extends Voltage220V implements Voltage5V {

	@Override
	public void output5V() {
		System.out.println("���" + super.VOLTAGE / 44 + "V��ѹ");

	}

}
