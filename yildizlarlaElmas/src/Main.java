import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.println("Enter The N :");
        n = inp.nextInt();

            for (int i = 1; i <= n; i++)
        {

            for (int j = 1; j <= (n - i); j++)
            {
                System.out.print(" ");
            }

            for(int k=1 ; k<=(2*i)-1;k++)
            {
                System.out.print("*");
            }

                 System.out.println();
        }

                         for(int z = n ; z>=1 ; z--)
                     {
                        for (int u = 1 ; u<=(2*z)-1 ; u++)
                        {
                             System.out.print("*");
                        }
                             System.out.println(" ");


                        for(int s = 0 ; s <=n-z ; s++ )
                        {

                             System.out.print(" ");
                        }
                     }
                             System.out.println();



    }}