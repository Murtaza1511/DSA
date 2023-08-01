
package Patterns;
import java.util.Scanner;

/*3 3 3
 * 2 2
 *3 1 3
 * 2 2
 *3 3 3
 */
public class DarshPatt 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        for(int i=0; i<n+2; i++)
        {
            for(int j=0; j<i+1; j++)
            {
                if(i%2==0 && j%2==0)
                {
                    System.out.print(" ");
                }
            }
        }

        
    }
}
