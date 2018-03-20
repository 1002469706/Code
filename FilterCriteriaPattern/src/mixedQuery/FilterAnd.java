package mixedQuery;

import java.util.ArrayList;
import java.util.List;

import criteria.Criteria;
import entity.Person;
/**
 * @see 查询所有输入条件的交集
 * @author Thornhill
 *
 */
public class FilterAnd implements Criteria {

	private List<Criteria> list = new ArrayList<Criteria>();

	public FilterAnd(Criteria... criterias) {
		for (Criteria criteria : criterias) {
			list.add(criteria);
		}
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> result = new ArrayList<Person>(persons);
		for (Criteria criteria : list) {
			result = criteria.meetCriteria(result);
		}
		return result;
	}

}
