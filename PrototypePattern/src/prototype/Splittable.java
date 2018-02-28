package prototype;

/**
 * @see 直接继承Java的Cloneable即可
 * @author Thornhill
 *
 */
public interface Splittable extends Cloneable {

	public Splittable clone() throws CloneNotSupportedException;

	public void showSelf();

}
