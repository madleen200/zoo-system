package Zoo.mammals;

public class Tigger extends Mammals {
	public Tigger (String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String feed() {
		// TODO Auto-generated method stub
		//return super.feed();
		return " the Tigger feed ==>  is bones";
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		//return super.sound();
		return " the Tigger Sound ==>   is TTTTT";
	}

	@Override
	public String continent() {
		// TODO Auto-generated method stub
		//return super.continent();
		return " the Tigger Continent ==>  is Lebanon";
	}

	@Override
	public String weather() {
		// TODO Auto-generated method stub
		//return super.weather();
		return " the Tigger weather ==> is cold";
	}

	@Override
	public String natural() {
		// TODO Auto-generated method stub
		//return super.natural();
		return " the Tigger feed ==>  is rainy forest";
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

