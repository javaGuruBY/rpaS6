package home;

public class HumanDemo {

	 public static void main(String[] args) {
		 Human human = new Human("Jack", 31);
		
		 System.out.println("Human name = " + human.name);
		System.out.println("Human age = " + human.age);

		 System.out.println();
		 System.out.println("Jack greet = " + human.isOn);
				 
		 System.out.println();
		 System.out.println("Hi, Jack!");
		 human.greetOn();
		 System.out.println("Jack greet = " + human.isOn);
		
	}
}
