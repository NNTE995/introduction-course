package day2_Examples;

public class example1 {

	public static void main(String[] args) {
		 int vowelCounter = 0, count3 = 0;
		 String string = "happy new year 2022";
		 
		 for(int i = 0; i < string.length(); i++) {
			 
			 //Checks if a character in the string is a vowel
			 if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
				 vowelCounter++; //Increment the vowel counter
				 if(vowelCounter%3 == 0) { //check every three vowels and increment the counter
					 count3++;
				 }
			 }
	     }
		 System.out.println("Number of every three vowels in the string is: " + count3); //print the counter every three vowels found in the string
	}
}