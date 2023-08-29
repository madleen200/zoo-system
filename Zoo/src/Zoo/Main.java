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
		    	System.out.println("1-ALL INFORMATION OF FALCON");
		    	System.out.println("2-NATURAL OA FALCON");
		    	System.out.println("3-CONTINENT OF FALCON");
		    	System.out.println("4-FEED OF FALCON");
		    	System.out.println("5-SOUND OF FALCON");
		    	System.out.println("6-WEATHER OF FALCON");
		    	
		    	Scanner scan = new Scanner(System.in);
				 int op1= scan.nextInt();
				 
				 switch (op1) {
				    case 1:
		   	System.out.print("NAtural: "+ b1.natural());
		    	
		    	 
		    System.out.println("CONTINENT"+ b1.continent());
		    
		    System.out.println("WEATHER"+ b1.weather());
		    
		    System.out.println("SOUND" + b1.sound());
		    
		    System.out.println("FEED"+ b1.feed());
		    
		    break;
				    case 2:
					   	System.out.print("NAtural: "+ b1.natural());
                        break;
                        
				    case 3:    
					    System.out.println("CONTINENT"+ b1.continent());

					    break;
					    
				    case 4:
					    System.out.println("FEED"+ b1.feed());
                         break;
                         
				    case 5:
					    System.out.println("SOUND" + b1.sound());
                         break;
                         
				    case 6:
					    System.out.println("WEATHER"+ b1.weather());

				    	break;
				 }
				    
				 break;
				    case 2:
				     	System.out.println("1-ALL INFORMATION OF PARROT");
				    	System.out.println("2-NATURAL OA PARROT");
				    	System.out.println("3-CONTINENT OF PARROT");
				    	System.out.println("4-FEED OF PARROT");
				    	System.out.println("5-SOUND OF PARROT");
				    	System.out.println("6-WEATHER OF PARROT");
				    	
				    	Scanner scan1 = new Scanner(System.in);
						 int op2= scan1.nextInt();
						 
						 switch (op2) {
						    case 1:
			
	                	System.out.println("NAtural: " + b1.natural());
				    	 
		                System.out.println("CONTINENT"+ b2.continent());
		    		    
		            	System.out.println("WEATHER"+ b2.weather());
		    		    
		            	System.out.println("SOUND"+ b2.sound());
		    		    
		            	System.out.println("FEED"+ b2.feed());
		            break;
						    case 2:
							   	System.out.print("NAtural: "+ b2.natural());
		                        break;
		                        
						    case 3:    
							    System.out.println("CONTINENT"+ b2.continent());

							    break;
							    
						    case 4:
							    System.out.println("FEED"+ b2.feed());
		                         break;
		                         
						    case 5:
							    System.out.println("SOUND" + b2.sound());
		                         break;
		                         
						    case 6:
							    System.out.println("WEATHER"+ b2.weather());

						    	break;
		               
						 }
		           break;
		  case 3:
		    	System.out.println("1-ALL INFORMATION OF LION");
		    	System.out.println("2-NATURAL OA LION");
		    	System.out.println("3-CONTINENT OF LION");
		    	System.out.println("4-FEED OF LION");
		    	System.out.println("5-SOUND OF LION");
		    	System.out.println("6-WEATHER OF LION");
		    	
		    	Scanner scan2 = new Scanner(System.in);
				 int op3= scan2.nextInt();
				 
				 switch (op3) {
				    case 1:
	  	         System.out.println("NAtural: " + m1.natural());
		    	 
		    	System.out.println("CONTINENT"+ m1.continent());
    		    
		    	System.out.println("WEATHER"+ m1.weather());
    		    
		    	System.out.println("SOUND"+ m1.sound());
    		    
		    	System.out.println("FEED"+ m1.feed());
		        break;
				    case 2:
					   	System.out.print("NAtural: "+ m1.natural());
                        break;
                        
				    case 3:    
					    System.out.println("CONTINENT"+ m1.continent());

					    break;
					    
				    case 4:
					    System.out.println("FEED"+ m1.feed());
                         break;
                         
				    case 5:
					    System.out.println("SOUND" + m1.sound());
                         break;
                         
				    case 6:
					    System.out.println("WEATHER"+ m1.weather());

				    	break;
               
				 }
		        break;
 case 4 :
	 

 	System.out.println("1-ALL INFORMATION OF TIGGER");
 	System.out.println("2-NATURAL OA TIGGER");
 	System.out.println("3-CONTINENT OF TIGGER");
 	System.out.println("4-FEED OF TIGGER");
 	System.out.println("5-SOUND OF TIGGER");
 	System.out.println("6-WEATHER OF TIGGER");
 	
 	Scanner scan3 = new Scanner(System.in);
		 int op4= scan3.nextInt();
		 
		 switch (op4) {
		    case 1:
		    	System.out.println("NAtural " + m2.natural());
		    	 
		    	System.out.println("CONTINENT"+ m2.continent());
    		    
    		    System.out.println("WEATHER"+ m2.weather());
    		    
    		    System.out.println("SOUND"+ m2.sound());
    		    
    		    System.out.println("FEED"+ m2.feed());
		        break;
		    case 2:
			   	System.out.print("NAtural: "+ m2.natural());
                break;
                
		    case 3:    
			    System.out.println("CONTINENT"+ m2.continent());

			    break;
			    
		    case 4:
			    System.out.println("FEED"+ m2.feed());
                 break;
                 
		    case 5:
			    System.out.println("SOUND" + m2.sound());
                 break;
                 
		    case 6:
			    System.out.println("WEATHER"+ m2.weather());

		    	break;
       
		 }
		break;        
 case 5:
	 System.out.println("1-ALL INFORMATION OF TURTLE");
	 	System.out.println("2-NATURAL OA TURTLE");
	 	System.out.println("3-CONTINENT OF TURTLE");
	 	System.out.println("4-FEED OF TURTLE");
	 	System.out.println("5-SOUND OF TURTLE");
	 	System.out.println("6-WEATHER OF TURTLE");
	 	
	 	Scanner scan4 = new Scanner(System.in);
			 int op5= scan4.nextInt();
			 
			 switch (op5) {
			    case 1:
		    	System.out.println("NAtural: " + r1.natural());
		    	 
		    	System.out.println("CONTINENT"+ r1.continent());
    		    
		    	System.out.println("WEATHER"+ r1.weather());
    		    
		    	System.out.println("SOUND"+ r1.sound());
    		    
		    	System.out.println("FEED"+ r1.feed());
		        break;
		        
			    case 2:
				   	System.out.print("NAtural: "+ r1.natural());
	                break;
	                
			    case 3:    
				    System.out.println("CONTINENT"+ r1.continent());

				    break;
				    
			    case 4:
				    System.out.println("FEED"+ r1.feed());
	                 break;
	                 
			    case 5:
				    System.out.println("SOUND" + r1.sound());
	                 break;
	                 
			    case 6:
				    System.out.println("WEATHER"+ r1.weather());

			    	break;
	       
			 }
		        break;
		    case 6:

		   	 System.out.println("1-ALL INFORMATION OF GRASSHOPERT");
		   	 	System.out.println("2-NATURAL OA GRASSHOPERT");
		   	 	System.out.println("3-CONTINENT OF GRASSHOPERT");
		   	 	System.out.println("4-FEED OF GRASSHOPERT");
		   	 	System.out.println("5-SOUND OF GRASSHOPERT");
		   	 	System.out.println("6-WEATHER OF GRASSHOPERT");
		   	 	
		   	 	Scanner scan5 = new Scanner(System.in);
		   			 int op6= scan5.nextInt();
		   			 
		   			 switch (op6) {
		   			    case 1:
		    	System.out.println("NAtural: " + r2.natural());
		    	 
		    	System.out.println("CONTINENT"+ r2.continent());
    		    
		    	System.out.println("WEATHER"+ r2.weather());
    		    
		    	System.out.println("SOUND"+ r2.sound());
    		    
		    	System.out.println("FEED"+ r2.feed());
		        break;
		   			   case 2:
						   	System.out.print("NAtural: "+ r2.natural());
			                break;
			                
					    case 3:    
						    System.out.println("CONTINENT"+ r2.continent());

						    break;
						    
					    case 4:
						    System.out.println("FEED"+ r2.feed());
			                 break;
			                 
					    case 5:
						    System.out.println("SOUND" + r2.sound());
			                 break;
			                 
					    case 6:
						    System.out.println("WEATHER"+ r2.weather());

					    	break;
			       
					 }
		        break;
		    case 7:
		    	System.out.println("1-ALL INFORMATION OF ACTABOUS");
		   	 	System.out.println("2-NATURAL OA ACTABOUS");
		   	 	System.out.println("3-CONTINENT OF ACTABOUS");
		   	 	System.out.println("4-FEED OF ACTABOUS");
		   	 	System.out.println("5-SOUND OF ACTABOUS");
		   	 	System.out.println("6-WEATHER OF ACTABOUS");
		   	 	
		   	 	Scanner scan6 = new Scanner(System.in);
		   			 int op7= scan6.nextInt();
		   			 
		   			 switch (op7) {
		   			    case 1:
		    	System.out.println("NAtural: " + f1.natural());
		    	 
		    	System.out.println("CONTINENT"+ f1.continent());
    		    
		    	System.out.println("WEATHER"+ f1.weather());
    		    
		    	System.out.println("SOUND"+ f1.sound());
    		    
		    	System.out.println("FEED"+ f1.feed());
		        break;
		   			  case 2:
						   	System.out.print("NAtural: "+ f1.natural());
			                break;
			                
					    case 3:    
						    System.out.println("CONTINENT"+ f1.continent());

						    break;
						    
					    case 4:
						    System.out.println("FEED"+ f1.feed());
			                 break;
			                 
					    case 5:
						    System.out.println("SOUND" + f1.sound());
			                 break;
			                 
					    case 6:
						    System.out.println("WEATHER"+ f1.weather());

					    	break;
			       
					 } 
		        break;
		    case 8:
		    	System.out.println("1-ALL INFORMATION OF SHARK");
		   	 	System.out.println("2-NATURAL OA SHARK");
		   	 	System.out.println("3-CONTINENT OF SHARK");
		   	 	System.out.println("4-FEED OF SHARK");
		   	 	System.out.println("5-SOUND OF SHARK");
		   	 	System.out.println("6-WEATHER OF SHARK");
		   	 	
		   	 	Scanner scan7 = new Scanner(System.in);
		   			 int op8= scan7.nextInt();
		   			 
		   			 switch (op8) {
		   			    case 1:
               	System.out.println("NAtural: " + f2.natural());
		    	 
		    	System.out.println("CONTINENT"+ f2.continent());
    		    
		    	System.out.println("WEATHER"+ f2.weather());
    		    
		    	System.out.println("SOUND"+ f2.sound());
    		    
		    	System.out.println("FEED"+ f2.feed());
		        break;
		   			  case 2:
						   	System.out.print("NAtural: "+ f2.natural());
			                break;
			                
					    case 3:    
						    System.out.println("CONTINENT"+ f2.continent());

						    break;
						    
					    case 4:
						    System.out.println("FEED"+ f2.feed());
			                 break;
			                 
					    case 5:
						    System.out.println("SOUND" + f2.sound());
			                 break;
			                 
					    case 6:
						    System.out.println("WEATHER"+ f2.weather());

					    	break;
			       
					 } 
		        break;
		    case 9:
		    	System.out.println("Good bye");
		    	break;
		    	
		    	default:
		    		System.out.println("Invalid choice please try later");
}

	
	
	
	}
}
