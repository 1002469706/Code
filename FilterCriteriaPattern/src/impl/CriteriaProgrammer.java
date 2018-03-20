package impl;

import java.util.ArrayList;
import java.util.List;

import criteria.Criteria;
import entity.Person;
import entity.PersonAttributes;

/**
 * @see 找出是程序员的实体
 * @author Thornhill
 *
 */
public class CriteriaProgrammer implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> list = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getCareer().equals(PersonAttributes.程序员)) {
				list.add(person);
			}
		}
		return list;
	}

}
