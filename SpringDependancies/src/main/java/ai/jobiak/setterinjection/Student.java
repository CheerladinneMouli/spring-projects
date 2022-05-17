package ai.jobiak.setterinjection;
public class Student {
	private int id;
	private String studentname;
	public Student(int id) {
		this.id=id;
	}
	public Student(int id, String studentname) {
		this.id = id;
		this.studentname = studentname;
	}
	public void displayStudentInfo() {
		System.out.println("Student name is : "+studentname
				+" and the id is : "+id);
	}

}
