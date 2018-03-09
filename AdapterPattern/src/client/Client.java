package client;

import adapter.Adapter1;
import adapter.Adapter2;
import phone.Voltage5V;

/**
 * @see �����ͻ���ʹ��
 * @author Thornhill
 *
 */
public class Client {

	public static void main(String[] args) {
		Voltage5V voltage5v1 = new Adapter1();
		Voltage5V voltage5v2 = new Adapter2();
		voltage5v1.output5V();
		voltage5v2.output5V();
	}

}
