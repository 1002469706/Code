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
		//加入元素
		persons.add(new Person("张1", PersonAttributes.男, PersonAttributes.程序员));
		persons.add(new Person("张2", PersonAttributes.男, PersonAttributes.医生));
		persons.add(new Person("张3", PersonAttributes.女, PersonAttributes.程序员));
		persons.add(new Person("张4", PersonAttributes.女, PersonAttributes.医生));
		//创建筛选
		Criteria criteriaMale = new CriteriaMale();
		Criteria criteriaFemale = new CriteriaFemale();
		Criteria criteriaDoctor = new CriteriaDoctor();
		Criteria criteriaProgrammer = new CriteriaProgrammer();
		//创建混合筛选
		Criteria filterAnd = new FilterAnd(criteriaFemale,criteriaProgrammer);//查询女程序员
		Criteria filterOr = new FilterOr(criteriaDoctor,criteriaMale);//查询医生或男
		//输出
		System.out.println(persons.toString());
		System.out.println(criteriaMale.meetCriteria(persons));
		System.out.println(criteriaFemale.meetCriteria(persons));
		System.out.println(criteriaProgrammer.meetCriteria(persons));
		System.out.println(criteriaDoctor.meetCriteria(persons));
		System.out.println("------------混合查询------------");
		System.out.println(filterAnd.meetCriteria(persons));
		System.out.println(filterOr.meetCriteria(persons));
		
	}

}
