package impl;

import java.util.ArrayList;
import java.util.List;

import criteria.Criteria;
import entity.Person;
import entity.PersonAttributes;

/**
 * @see 找出是医生的实体
 * @author Thornhill
 *
 */
public class CriteriaDoctor implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> list = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getCareer().equals(PersonAttributes.医生)) {
				list.add(person);
			}
		}
		return list;
	}

}
