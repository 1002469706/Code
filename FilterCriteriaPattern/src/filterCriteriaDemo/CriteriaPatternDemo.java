package filterCriteriaDemo;

import java.util.*;

import criteria.Criteria;
import entity.*;
import impl.*;
import mixedQuery.FilterAnd;
import mixedQuery.FilterOr;

public class CriteriaPatternDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		//����Ԫ��
		persons.add(new Person("��1", PersonAttributes.��, PersonAttributes.����Ա));
		persons.add(new Person("��2", PersonAttributes.��, PersonAttributes.ҽ��));
		persons.add(new Person("��3", PersonAttributes.Ů, PersonAttributes.����Ա));
		persons.add(new Person("��4", PersonAttributes.Ů, PersonAttributes.ҽ��));
		//����ɸѡ
		Criteria criteriaMale = new CriteriaMale();
		Criteria criteriaFemale = new CriteriaFemale();
		Criteria criteriaDoctor = new CriteriaDoctor();
		Criteria criteriaProgrammer = new CriteriaProgrammer();
		//�������ɸѡ
		Criteria filterAnd = new FilterAnd(criteriaFemale,criteriaProgrammer);//��ѯŮ����Ա
		Criteria filterOr = new FilterOr(criteriaDoctor,criteriaMale);//��ѯҽ������
		//���
		System.out.println(persons.toString());
		System.out.println(criteriaMale.meetCriteria(persons));
		System.out.println(criteriaFemale.meetCriteria(persons));
		System.out.println(criteriaProgrammer.meetCriteria(persons));
		System.out.println(criteriaDoctor.meetCriteria(persons));
		System.out.println("------------��ϲ�ѯ------------");
		System.out.println(filterAnd.meetCriteria(persons));
		System.out.println(filterOr.meetCriteria(persons));
		
	}

}
