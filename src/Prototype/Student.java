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
	
	public Student() {
		
	}
	
	public Student(Student other) {
		this.id = other.id;
		this.name = other.name;
		this.batch = other.batch;
	}
	
	@Override
	public Student getClone() {
		return new Student(this);
	}
	
}
