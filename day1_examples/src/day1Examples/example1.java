package day1Examples;

public class example1 {
	
	private static void OddEvenPatern() {
		int k =4;
		for(int i = 1; i <= 5; i++) { //row
			int lastJCount = 0;
			for(int j = 0; j < k; j++) { //column
				System.out.print("*");
				lastJCount = j;
				}
			
			for(int a = lastJCount + 1; a < 5; a++) {
				if(i%2 == 0)
					System.out.print("E");
				else 
					System.out.print("O");
				}
			k--;
			System.out.println();
			}
		}
	
	public static void main(String[] args) {
		OddEvenPatern();
		}
}