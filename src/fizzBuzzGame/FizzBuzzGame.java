package fizzBuzzGame;

public class FizzBuzzGame {

	public static void main(String[] args) {
		
		int i = 1; 
		
		for (i = 1; i < 100; i++) {
			if(i <= 1) {
				System.out.println(i);
			} else if(i % 15 == 0) {
				System.out.println("Fizz Buzz");
			} else if(i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0){
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		
		
	}

}
