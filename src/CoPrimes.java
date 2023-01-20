/**
 * Generate the co-primes from (1,1) to (m,n)
 * 
 * Nathan Hutton
 *
 */
public class CoPrimes {
	private static int gcd(int a, int b) 
	{
		int temp = 0;
	    while (b != 0) {
	    	temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("Must be passed two integer values > 0");
			
			System.exit(0);
		}
		
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		
		for(int i = 1; i <= m; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(gcd(i,j) == 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		/*for(int i = m; i >= 1; i--)
		{
			for(int j = 1; j <= 15; j++)
			{
				if(gcd(i,j) == 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		} */
	}

}
