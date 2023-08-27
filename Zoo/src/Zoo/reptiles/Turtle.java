package Zoo.reptiles;

public class Turtle extends Reptiles {

	public Turtle(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String feed() {
		// TODO Auto-generated method stub
		//return super.feed();
	
		return " the turtle feed ==>  is vegetables";
}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		//return super.sound();
		return " the turtle sound ==>  is ttttt";

	}

	@Override
	public String continent() {
		// TODO Auto-generated method stub
		//return super.continent();
		return " the turtle continent ==>  is Europe";

	}

	@Override
	public String weather() {
		// TODO Auto-generated method stub
		//return super.weather();
		return " the turtle weather ==>  is warm";

	}

	@Override
	public String natural() {
		// TODO Auto-generated method stub
		//return super.natural();
		return " the turtle natural ==> is feilds";

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
