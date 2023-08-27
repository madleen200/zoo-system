package Zoo.birds;


public class Parrot extends Birds  {

	public Parrot(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String continent() {
		// TODO Auto-generated method stub
		//return super.continent();
		return " the parrot  Continent is ==>  warm houses , tropical forest";

	}

	@Override
	public String weather() {
		// TODO Auto-generated method stub
		//return super.weather();
		return " the parrot  weather ==>   is hot";

	}

	@Override
	public String natural() {
		// TODO Auto-generated method stub
		//return super.natural();
		return " the parrot natural ==>   is hot";

	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		//return super.sound();
		return " the parrot  sound ==>  is PPPPP";

	}

	@Override
	public String feed() {
		// TODO Auto-generated method stub
		//return super.feed();
		return " the parrot  Feed ==> is cereal";

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
