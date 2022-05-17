package ai.jobiak.qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ai.jobiak.object.Cheat;

public class Student {
	private Cheat cheat;
	public Student() {
		
	}
	public Student(Cheat cheat) {
		super();
		this.cheat = cheat;
	}
	@Autowired
	@Qualifier("mathcheatobj")
	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	public void cheating() {
		if(cheat!=null) {
			cheat.cheat();
			System.out.println("I want this cheat "+cheat);
		}else {
			System.out.println("Cheating is not allowed");
		}
	}
}


