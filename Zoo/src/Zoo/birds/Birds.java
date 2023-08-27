package Zoo.birds;


import Zoo.Animal;
import Zoo.Environment;
import Zoo.Feed;
public class Birds extends Animal implements Feed, Environment  {

	public Birds(String name, int age) {
		super(name, age);
	}
	

	@Override
	public String continent() {
        return" the birds continent is europe.";
	}

	@Override
	public String weather() {
        return"the birds weather is warm.";	
	}

	@Override
	public String natural() {
        return "the birds natural is tropical forest.";	
	}
	@Override
	public String sound() {
	
		 return "The birds sound is kkkk";
	}

	@Override
	public String feed() {
        return"Feeding the birds with cereal.";
		
	}

}
