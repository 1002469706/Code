package impl;

import java.util.ArrayList;
import java.util.List;

import criteria.Criteria;
import entity.Person;
import entity.PersonAttributes;

/**
 * @see �ҳ���ҽ����ʵ��
 * @author Thornhill
 *
 */
public class CriteriaDoctor implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> list = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getCareer().equals(PersonAttributes.ҽ��)) {
				list.add(person);
			}
		}
		return list;
	}

}
