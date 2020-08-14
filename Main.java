/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
    static int minCoins(int coins[], int m, int V)
    {
        if(V == 0)
        {
            return 0;
        }
        
        int res = Integer.MAX_VALUE;
        
        for(int i = 0; i < m; i++)
        {
            if(coins[i] <= V)
            {
                int sub_res = minCoins(coins, m , V-coins[i]);
                
                if(sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                {
                    res = sub_res + 1;
                }
            }
        }
        return res;
    }
    
    
	public static void main(String[] args) 
	{
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("The given coins are [1, 5, 10, 25, 50, 100].");
	    System.out.println("Enter the value for a coin: ");
	    int V = sc.nextInt();
	    sc.close();
	    
	    //System.out.println("Enter the value for the coins: ");
	    //int coins = sc.nextInt();
	    //sc.close();
	    
        int coins[] = {1, 5, 10, 25, 50, 100};
        int m = coins.length;
        System.out.println("Minimum number of coins required is " + minCoins(coins, m, V) + ".");
        
        //System.out.println("Minimum number of coins required is ");
        //minCoins(coins);
        /*
		int coins[] = {9, 6, 5, 1};
		int m = coins.length;
		int V = 16;
		System.out.println("Minimum number of coins required is " + minCoins(coins, m, V) + ".");
	    */
	}
}
