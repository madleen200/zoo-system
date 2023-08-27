package Zoo.mammals;

public class Lion extends Mammals{

	public Lion(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String feed() {
		// TODO Auto-generated method stub
		//return super.feed();
		return " the lion feed ==>  is meat";

	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		//return super.sound();
		return " the lion sound ==>   is LLLL";
	}

	@Override
	public String continent() {
		// TODO Auto-generated method stub
		//return super.continent();
		return " the lion continent  ==>  is South America";
	}

	@Override
	public String weather() {
		// TODO Auto-generated method stub
		//return super.weather();
		return " the lion weather ==>  is freezy";
	}

	@Override
	public String natural() {
		// TODO Auto-generated method stub
		//return super.natural();
		return " the lion natural ==>  is Forest";
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
