package Zoo.reptiles;

public class Grasshoper extends Reptiles {
	public Grasshoper(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String feed() {
		// TODO Auto-generated method stub
		//return super.feed();
		return " the grasshoper feed ==>  is insect";
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		//return super.sound();
		return " the grasshoper sound ==> is gggg";

	}

	@Override
	public String continent() {
		// TODO Auto-generated method stub
		//return super.continent();
		return " the grasshoper continent ==>  is Asia";

	}

	@Override
	public String weather() {
		// TODO Auto-generated method stub
		//return super.weather();
		return " the grasshoper weather ==>  is cool" ;

	}

	@Override
	public String natural() {
		// TODO Auto-generated method stub
		//return super.natural();
		return " the grasshoper  natural ==> is grassy";

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
