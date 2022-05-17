package ai.jobiak.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heart;
	public Human() {
		
	}
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public void startPump() {
		if(heart!=null) {
		heart.pump();
	}
		else {
			System.out.println("You are dead");
		}
		}

}
