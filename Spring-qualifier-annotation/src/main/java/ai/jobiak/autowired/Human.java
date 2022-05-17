package ai.jobiak.autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Human {
	private Heart heart;
	public Human() {
		
	}
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
	@Autowired
	@Qualifier("octopousheart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public void startPump() {
		if(heart!=null) {
		heart.pump();
		System.out.println("name of the animal is : " + heart.getNameOfAnimal()+" no of heart present : " + heart.getNoOfHeart());
	}
		else {
			System.out.println("You are dead");
		}
		}

}
