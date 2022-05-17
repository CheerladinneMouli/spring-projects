package ai.jobiak.com;
public class UseGarden {
	ArrayList<String>fruits;
	ArrayList<String>flowers;
	HashSet<String>trees;
	public UseGarden() {
		
	}
	public Garden(ArrayList<String>flowers) {
		this.flowers=flowers;
	}
	public void setCityFruit(HashMap<String,String>cityFruit) {
		this.cityFruit=cityFruit;
	}
	public HashMap<String,String>getcityFruiy {
		return this.cityFruit;
	}
	
}
