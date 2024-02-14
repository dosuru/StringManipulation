import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doctor implements Comparable<Doctor> {
	int id;
	String name;
	int age;
	public Doctor() {
		
	}
	public Doctor(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
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
		return "Doctor [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Doctor o) {
		if(age == o.getAge()) {
			return 0;
		}
		else if(age > o.getAge()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		List<Doctor> list = new ArrayList<Doctor>();
		list.add(new Doctor(4,"Ravi",23));
		list.add(new Doctor(2,"Tulasi",25));
		list.add(new Doctor(7,"Prasad",22));
		Collections.sort(list);
		//System.out.println(list);
		for(Doctor d1:list) {
			System.out.println(d1);
		}
		
	}
	
	
	
	
		
}



	
