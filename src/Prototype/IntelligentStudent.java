package Prototype;

public class IntelligentStudent extends Student{

	int iq;

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}
	
	@Override
	public IntelligentStudent getClone() {
		IntelligentStudent iS = new IntelligentStudent();
		iS.id = this.id;
		iS.name = this.name;
		iS.iq = this.iq;
		return iS;
	}
	
}
