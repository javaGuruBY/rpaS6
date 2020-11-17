package home;

public class Human {
	
	String name;
	int age;
	
	 public Human(String name, int age) {
	 this.name = name;
	 this.age = age;
	 }
		 public boolean isOn;
		 public void greetOn() {
		 this.isOn = true;
		 }
		 public void greetOff() {
		 this.isOn = false;
		}
		
}
