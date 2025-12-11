package Prototype;

public class IntelligentStudent extends Student{

	int iq;

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}
	
	public IntelligentStudent() {
		
	}
	
	public IntelligentStudent (IntelligentStudent other) {
		super(other);
		this.iq= other.iq;
	}
	@Override
	public IntelligentStudent getClone() {
		return new IntelligentStudent(this);
	}
	
}
