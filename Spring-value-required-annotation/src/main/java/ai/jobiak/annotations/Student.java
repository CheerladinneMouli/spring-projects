package ai.jobiak.annotations;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
public class Student {
	@Value("${Mouli}")
	private String name;
	@Value("${java}")
	private String interestedcourse;
	@Value("${writing motivational Quotes}")
	private String hobby;
	public Student() {
	}
public void displayStudentInfo() {
	System.out.println("Student name " + name);
	System.out.println("Student interested course " + interestedcourse);
	System.out.println("Student hobby " + hobby);
	
}
}
