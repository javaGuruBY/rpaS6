package home;

public class Dog {
	
	int age;
	String color;
	String name;
	
	 public Dog(int age, String color, String name) {
	 this.age = age;
	 this.color = color;
	 this.name = name;
	 }
		 public boolean isOn;
		 public void voiceOn() {
		 this.isOn = true;
		 }
		 public void voiceOff() {
		 this.isOn = false;
		}
		 public boolean eaOn;
		 public void eatOn() {
		 this.eaOn = true;
		 }
		 public void eatOff() {
		 this.eaOn = false;
		}
		 public boolean slOn;
		 public void sleepOn() {
		 this.slOn = true;
		 }
		 public void sleepOff() {
		 this.slOn = false;
		}

}
