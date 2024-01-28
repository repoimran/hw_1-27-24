import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * Declare a double type variable hbA1c and initialize it by scanner.nextDouble().
			
Step 06: Now write some conditions. If your hbA1c value is more than 6.4, the outcome will be "I am a diabetic patient".

Step 07: If your hbA1c value is not more than 6.4, Congratulation! you are not diabetic.

Step 08: Now introduce the nested if condition below. if hbA1c >= 5.7, the outcome will be "I am a pre-diabetic patient".

Step 09: if hbA1c < 5.7, the outcome will be "I am a healthy person".

Step 10: In the above conditions, use an appropriate keyword like if, else if, or else to execute your health condition.
		 */
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter value of your hbA1c");
		double hbA1c = sc.nextDouble();

		
//		if(hbA1c > 6.5) System.out.println("I am diabetic patient");
//		else {
//		System.out.println("Congratulation! you are not diabetic.");  
//		System.out.println(hbA1c < 5.7 && hbA1c <= 6.4 ? "I am a healthy person":"I am a pre-diabetic patient" );
//		}
		
		
		
//		if(hbA1c <= 6.4) System.out.println("Congratulation! you are not diabetic");
//		System.out.println(hbA1c > 6.5 ? "I am diabetic patient":(hbA1c < 5.7 ? "I am a healthy person" : "I am a pre-diabetic patient"));

		System.out.println(hbA1c > 6.5 ? "I am diabetic patient" : ("Congratulation! you are not diabetic.\n" + (hbA1c < 5.7 ? "I am a healthy person" : "I am a pre-diabetic patient")));

		
	}
	
}
