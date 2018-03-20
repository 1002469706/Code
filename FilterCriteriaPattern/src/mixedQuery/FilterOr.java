package mixedQuery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import criteria.Criteria;
import entity.Person;
/**
 * @see 查询所有输入条件的并集
 * @author Thornhill
 *
 */
public class FilterOr implements Criteria {
	private List<Criteria> list = new ArrayList<Criteria>();

	public FilterOr(Criteria... criterias) {
		for (Criteria criteria : criterias) {
			list.add(criteria);
		}
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		Set<Person> result = new HashSet<Person>();
		for (Criteria criteria : list) {
			result.addAll(criteria.meetCriteria(persons));
		}
		return new ArrayList<Person>(result);
	}

}
