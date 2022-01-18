package day2_Examples;

public class example2 {

	public static int soldiers(int n, int k) {
		if (n == 1) //if there is just one soldier return one
            return 1;
        else
            /*The recursive call soldiers(n - 1, k) considers the original
            position k%n + 1 as position 1 */
            return (soldiers(n - 1, k) + k - 1) % n + 1;
		    /*this recursive call generates the final position of the survivor,
		    where n is the number of soldiers and k is the number where the  cycle start
		    */ 
	}
	
	public static void main (String[] args)	{
		int n = 5, k = 2; //n soldiers, k start position
		System.out.println("The survivor soldier is on the position: " + soldiers(n, k));
	}
}