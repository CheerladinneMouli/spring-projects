package ai.jobiak.constructorinjection;
public class Student {
	private int id;
	private String studentname;
	public Student() {
		
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("set method is called : "+"setId");
	}


	public void setStudentname(String studentname) {
		this.studentname = studentname;
		System.out.println("set method is called : "+"setStudentname");
	}
	public void displayStudentInfo() {
		System.out.println("Student name is : "+studentname
				+" and the id is : "+id);
	}
	
	public void displayStudentInfo1() {
		System.out.println("Student name is : "+studentname);
	}

}
