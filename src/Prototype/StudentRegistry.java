package Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
	
	//here, we need to add the student type and store it to the registry .
	
	private Map<String, Student> registryMap = new HashMap<>();
	
	void register(String key , Student s){
		if(registryMap.get(key)==null) {
			registryMap.put(key, s);
		}
	}
	
	Student getStudentType(String key) {
		return registryMap.get(key);
	}
}
