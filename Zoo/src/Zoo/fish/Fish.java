package Zoo.fish;

import Zoo.Animal;
import Zoo.Environment;
import Zoo.Feed;

public class Fish extends Animal implements Feed,Environment {
    public Fish(String name, int age) {
        super(name, age);
    }
    public final String Fishesliving() {
		return "ALL KIND OF FISHES LIVES ONLY IN WATER PLACES";
	}
   
    public String feed() {
        return"Feeding the fish with flakes.";
    }
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "The fish sound is ssss";
	}
	@Override
	public String continent() {
		// TODO Auto-generated method stub
		 return"The fish continent is Asia";
	}
	@Override
	public String weather() {
		// TODO Auto-generated method stub
		 return " the fish weather is warm";
		
	}
	@Override
	public String natural() {
		// TODO Auto-generated method stub
		return"The fish natural is ocean , lake, sea";
	}}