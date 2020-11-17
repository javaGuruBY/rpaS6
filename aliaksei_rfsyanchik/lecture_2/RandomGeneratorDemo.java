package home;

public class RandomGeneratorDemo {
	public static void main(String[] args){
		int randomNumber1 =(int) (Math.random()*100);
		int randomNumber2 =(int) (Math.random()*100);
		int randomNumber3 =(int) (Math.random()*100);
       
               System.out.println ("Random number 1 = " + randomNumber1);
               System.out.println ("Random number 2 = " + randomNumber2);
               System.out.println ("Random number 3 = " + randomNumber3);
               System.out.println ();
               System.out.println ("Addition random number: " +(randomNumber1 + randomNumber2 + randomNumber3));
	}

}
