package Prototype;

public class Client {
	
	
	//lets have a method to fill the registryMap, so that during the start of application itself, it gets populated
	public static void fillRegistry(StudentRegistry sr) {
		Student aprBatch = new Student();
		aprBatch.setId(10);
		aprBatch.setName("Apr-Batch");
		aprBatch.setBatch("April");
		
		sr.register(EnumBatchSet.APR_BATCH.getLabel() , aprBatch);
		
		IntelligentStudent mayBatch = new IntelligentStudent();
		mayBatch.setId(11);
		mayBatch.setName("May-Batch");
		mayBatch.setBatch("May");
		mayBatch.setIq(12);
		
		sr.register(EnumBatchSet.MAY_BATCH.getLabel(), mayBatch);
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		//old way of copying--->
		//Student s = new Student();
		
		//Student s1 = new IntelligentStudent();
		//below is the prototype pattern--->
//		Student s = new Student();
//		s.id = 1;
//		s.name = "Sri";
//		s.batch = "X";
//		
//		Student s1 = s.getClone();
//		
//		System.out.println(s1.getName());
//		
//		
//		IntelligentStudent s2 = new IntelligentStudent();
//		s2.id = 1;
//		s2.name = "Sriky";
//		s2.batch = "Y";
//		s2.iq = 10;
//		
//		IntelligentStudent s3 = s2.getClone();
//		
//		System.out.println(s3.getName());
		
		//registry pattern--->
		StudentRegistry sr = new StudentRegistry();
		fillRegistry(sr);
		
		Student s = sr.getStudentType(EnumBatchSet.APR_BATCH.getLabel()).getClone();
		System.out.println(s.getName());
	}
	
}


//Prototype pattern basically helps in easing out a way of copying a particular object without much hassle, we create a interface having clone method which
//is implemented by the classes whose objects need to be cloned, so, during runtime we can directly call the clone method using that object 
//(here, the responsibility of calling the copying is given to the object itself rather than the client doing it seperately)