package day1Examples;

public class example2 {
	
	private static void patern2() {
		int k = 6;
		
		for(int i = 1; i < k; i++) { //columns
			for(int j = 0; j <= 5; j++) { //rows
				
				if(i%2 == 0) { 
					if(j==0 || j==5)
						System.out.print(" ");
					else 
						System.out.print("*");
				}
				else 
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		patern2();
	}
}