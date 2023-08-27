package Zoo;

 public class Animal implements Environment, Feed {
	public static boolean thinkingLikeHuman() {
		return false;
	}
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	private String name;
private int age;
public Animal(String name, int age) {
    this.name = name;
    this.age = age;	
}
public String sound() {
    return"Animal sound";
}
@Override
public String feed() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String continent() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String weather() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String natural() {
	// TODO Auto-generated method stub
	return null;
}
 }