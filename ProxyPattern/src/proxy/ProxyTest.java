package proxy;

public class ProxyTest {

	public static void main(String[] args) {
		Service service = new ServiceImpl();
		ServiceInvocationHandler serviceInvocationHandler = new ServiceInvocationHandler(service);
		Service proxyService = (Service) serviceInvocationHandler.getProxy();
		proxyService.serve();
		System.out.println(proxyService.getClass().getName());
	}

}
