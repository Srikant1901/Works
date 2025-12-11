package Prototype;

public class Student implements Prototype<Student> {
	
	int id ;
	String name;
	String batch;
	
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
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	
	@Override
	public Student getClone() {
		Student copy = new Student();
		copy.id = this.id;
		copy.name = this.name;
		return copy;
	}
	
}
