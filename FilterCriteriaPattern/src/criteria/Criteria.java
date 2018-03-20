package criteria;

import entity.*;
import java.util.List;

/**
 * @see 定义过滤的行为
 * @author Thornhill
 *
 */
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
