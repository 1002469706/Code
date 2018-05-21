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
		System.out.println("前置的代理处理:" + "服务开始计时");
		Date startDate = new Date(System.currentTimeMillis());

		Object result = method.invoke(target, args);

		Date endDate = new Date(System.currentTimeMillis());
		System.out.print("后置的代理处理\n" + "计时结束运行时间为:");
		System.out.println(endDate.getTime() - startDate.getTime());
		return result;
	}

	public Object getProxy() {

		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(),
				this);

	}

}
