package product;

import formation.object.*;
import formation.object.Object;
import formation.predicate.*;
import formation.sbuject.*;

/**
 * 
 * @author Thornhill
 * @see ²úÆ·¿ò¼Ü
 */
public class ChickenSoup {
	private Subject subject;
	private Predicate predicate;
	private Object object;

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Predicate getPredicate() {
		return predicate;
	}

	public void setPredicate(Predicate predicate) {
		this.predicate = predicate;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public void showChickenSoup() {
		subject.showSbuject();
		predicate.showPredicate();
		object.showObject();
	}
}
