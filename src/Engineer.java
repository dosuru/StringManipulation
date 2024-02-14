import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Engineer {
	int id;
	String name;
	int age;
	float salary;

	public Engineer(int id, String name, int age,float salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary=salary;

	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Engineer [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Engineer> li = new ArrayList<Engineer>();
		li.add(new Engineer(13, "Tulasi", 23,20000));
		li.add(new Engineer(2, "Prasad", 45,35000));
		li.add(new Engineer(5, "tejaswi", 4,10000));
		li.add(new Engineer(1, "subbu", 32,5000));

		Collections.sort(li, new SalaryComparator());

		for (Engineer engg : li) {
			System.out.println(engg);
		}

		System.out.println("----------");
		Collections.sort(li, new NameComparator());
		for (Engineer engg : li) {
			System.out.println(engg);
		}

	}

}

class SalaryComparator implements Comparator<Engineer> {
	@Override
	public int compare(Engineer o1, Engineer o2) {
		if (o1.getSalary() > o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}

	}
}

class NameComparator implements Comparator<Engineer> {

	@Override
	public int compare(Engineer o1, Engineer o2) {
        if(o1.getName().compareToIgnoreCase(o2.getName())<0) {
        	return 1;
        }
        return -1;

	}
}
