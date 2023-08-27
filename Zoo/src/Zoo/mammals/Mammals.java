package Zoo.mammals;
import Zoo.Environment;
import Zoo.Animal;
import Zoo.Feed;

public class Mammals extends Animal implements Feed, Environment{
    public Mammals(String name, int age) {
        super(name, age);
    }
	
	
	
    public String feed() {
      
        
        return "Feeding the mammals with meats.";
    }
    @Override
    public String sound() {
    	 return"the mammals sound is hmmm";
    }
    @Override
    public String continent() {
    	 return "the mammals continent is south America";
    }
    @Override
    public String  weather() {
    	 return "the mammals weather is freezy";
    }
    @Override
    public String natural() {
    	return "the mammals natural is forest";
    }
}
