package criteria;

import entity.*;
import java.util.List;

/**
 * @see ������˵���Ϊ
 * @author Thornhill
 *
 */
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
