package Zoo.fish;

public class Shark extends Fish {

	public Shark(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String feed() {
		// TODO Auto-generated method stub
	//	return super.feed();
		return " the Shark  feed==>   is weak fishes";
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		//return super.sound();
		return " the Shark  Sound ==> is SUSUSU";
	}

	@Override
	public String continent() {
		// TODO Auto-generated method stub
		//return super.continent();
		return " the Shark  Continent ==>  is Asia";
	}

	@Override
	public String weather() {
		// TODO Auto-generated method stub
		//return super.weather();
		return " the Shark  weather ==>  is cool";
	}

	@Override
	public String natural() {
		// TODO Auto-generated method stub
		//return super.natural();
		return " the Shark  natural ==> is oceans & seas";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

}
