package factory;

public class HumanFactory1 {
	public static <T> T getClass(Class<? extends T> c) {
		T result = null;
		try {
			result = (T) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {

			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return result;
	}
}
