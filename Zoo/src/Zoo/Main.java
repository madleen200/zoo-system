package Zoo;

import java.util.Scanner;
import Zoo.fish.*;
import Zoo.mammals.*;
import Zoo.reptiles.*;
import Zoo.birds.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("DO ANIMALS THINK LIKE HUMANS:  ");	
System.out.println(Animal.thinkingLikeHuman());	
	

		Animal b1= new Falcon ("Falcon", 2);
		Animal b2 = new Parrot ("Parrot",3);
		
		Animal m1=  new Tigger ("Lion", 6);
		Animal m2=new Lion ("Tigger", 5);
				
			Animal  r1= new Turtle ("Turtle", 2);
		Animal  r2= new Grasshoper ("Grasshopert", 3);
		
		Animal f1= new Actabous ("Actabous", 10);
		Animal f2= new Shark ("Shark", 9);
	
	System.out.println("1- Falcon");
	System.out.println("2- Parrot");
	System.out.println("3- Lion");
	System.out.println("4- Tigger");
	System.out.println("5- Turtle");
	System.out.println("6- Grasshopert");
	System.out.println("7- Actabous");
	System.out.println("8- Shark");
	System.out.println("9- Exit");

	
	System.out.println("Please Choose which animal do you want to know about: ");

	       
	Scanner scanner = new Scanner(System.in);

		 int input= scanner.nextInt();
		 
		switch (input) {
		    case 1:
		    	
		   	System.out.print("NAtural: "+ b1.natural());
		    	
		    	 
		    System.out.println("CONTINENT"+ b1.continent());
		    
		    System.out.println("WEATHER"+ b1.weather());
		    
		    System.out.println("SOUND" + b1.sound());
		    
		    System.out.println("FEED"+ b1.feed());
		    
		    break;
		    
		        case 2:
	                	System.out.println("NAtural: " + b1.natural());
				    	 
		                System.out.println("CONTINENT"+ b2.continent());
		    		    
		            	System.out.println("WEATHER"+ b2.weather());
		    		    
		            	System.out.println("SOUND"+ b2.sound());
		    		    
		            	System.out.println("FEED"+ b2.feed());
		            break;
		               
		            
		           
		  case 3:
	  	         System.out.println("NAtural: " + m1.natural());
		    	 
		    	System.out.println("CONTINENT"+ m1.continent());
    		    
		    	System.out.println("WEATHER"+ m1.weather());
    		    
		    	System.out.println("SOUND"+ m1.sound());
    		    
		    	System.out.println("FEED"+ m1.feed());
		        break;
 case 4 :
		    	System.out.println("NAtural " + m2.natural());
		    	 
		    	System.out.println("CONTINENT"+ m2.continent());
    		    
    		    System.out.println("WEATHER"+ m2.weather());
    		    
    		    System.out.println("SOUND"+ m2.sound());
    		    
    		    System.out.println("FEED"+ m2.feed());
		        break;
 case 5:
		    	System.out.println("NAtural: " + r1.natural());
		    	 
		    	System.out.println("CONTINENT"+ r1.continent());
    		    
		    	System.out.println("WEATHER"+ r1.weather());
    		    
		    	System.out.println("SOUND"+ r1.sound());
    		    
		    	System.out.println("FEED"+ r1.feed());
		        break;
		    case 6:
		    	System.out.println("NAtural: " + r2.natural());
		    	 
		    	System.out.println("CONTINENT"+ r2.continent());
    		    
		    	System.out.println("WEATHER"+ r2.weather());
    		    
		    	System.out.println("SOUND"+ r2.sound());
    		    
		    	System.out.println("FEED"+ r2.feed());
		        break;
		    case 7:
		    	System.out.println("NAtural: " + f1.natural());
		    	 
		    	System.out.println("CONTINENT"+ f1.continent());
    		    
		    	System.out.println("WEATHER"+ f1.weather());
    		    
		    	System.out.println("SOUND"+ f1.sound());
    		    
		    	System.out.println("FEED"+ f1.feed());
		        break;
		    case 8:
               	System.out.println("NAtural: " + f2.natural());
		    	 
		    	System.out.println("CONTINENT"+ f2.continent());
    		    
		    	System.out.println("WEATHER"+ f2.weather());
    		    
		    	System.out.println("SOUND"+ f2.sound());
    		    
		    	System.out.println("FEED"+ f2.feed());
		        break;
		    case 9:
		    	System.out.println("Good bye");
		    	break;
		    	
		    	default:
		    		System.out.println("Invalid choice please try later");
}

	
	
	
	}
}