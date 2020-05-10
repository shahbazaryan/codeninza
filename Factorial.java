package introduction;
import java.util.*;
public class Factorial
  {

	public static void main(String[] args)
	  {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number for finding factorial");
		n=sc.nextInt();
        int ans=fact(n);
        System.out.println("Factorial of " + n + " is " + ans);
	  }
    private static int fact(int num)
     {
    	 if(num==1)
    		 return 1;
    	 else
    		 return(num*fact(num-1));
     }
  }
