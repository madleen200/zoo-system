package Zoo.reptiles;

import Zoo.Environment;
import Zoo.Animal;
import Zoo.Feed;

public class Reptiles extends Animal implements Feed ,Environment{
    public Reptiles(String name, int age) {
        super(name, age);
    }
  
    public String feed() {
        return"Feeding the reptiles with insects.";
    }
    @Override
    public String sound() {
    	 return"the reptiles sound is Hiss";
    }
    @Override
    public String continent() {
    	return "the reptiles continent is North America";
    }
    @Override
    public String weather() {
    	return "the reptiles weather is Hot";
    }
    @Override
    public String natural() {
    	 return "the reptiles natural is Desert";
    }
}
