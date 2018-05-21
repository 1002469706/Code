package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;

public class ServiceInvocationHandler implements InvocationHandler {

	private Object target;

	public ServiceInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("ǰ�õĴ�����:" + "����ʼ��ʱ");
		Date startDate = new Date(System.currentTimeMillis());

		Object result = method.invoke(target, args);

		Date endDate = new Date(System.currentTimeMillis());
		System.out.print("���õĴ�����\n" + "��ʱ��������ʱ��Ϊ:");
		System.out.println(endDate.getTime() - startDate.getTime());
		return result;
	}

	public Object getProxy() {

		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(),
				this);

	}

}
