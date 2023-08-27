package Zoo.birds;

public class Falcon extends Birds {

	public Falcon(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String continent() {
		// TODO Auto-generated method stub
		//return super.continent();
		return " the Falcon  Continent ==> is Jordan";
	}

	@Override
	public String weather() {
		// TODO Auto-generated method stub
		//return super.weather();
		return " the Falcon  weather ==> is hot";

	}

	@Override
	public String natural() {
		// TODO Auto-generated method stub
		//return super.natural();
		return " the Falcon  natural is ==>  woody forest";

	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		//return super.sound();
		return " the Falcon Sound ==>  is FFFFF";

	}

	@Override
	public String feed() {
		// TODO Auto-generated method stub
		//return super.feed();
		return " the Falcon  Feed ==>  is small birds";

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
