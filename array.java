package introduction;
import java.util.*;
public class array 
  {
      public static void main(String[] args)
       {
	     Scanner sc=new Scanner(System.in);
	     int i,size,j,mostoccur=0,count=0;
	     System.out.println("enter the size of aaray");
	     size=sc.nextInt();
	     int ar[]=new int[size];
	     System.out.println("enter the element in array");
	     for(i=0;i<size;i++)
		  ar[i]=sc.nextInt();
	      System.out.println("entered element are");
	     for(i=0;i<size;i++)
		  System.out.println(ar[i]);
	     for(i=0;i<size;i++)
	       {
             for(j=i+1;j<size;j++)
               {
            	 if(ar[j]==ar[i])
            		 count++;
               }
             if(count>mostoccur)
            	 mostoccur=ar[i];
	       }
	     System.out.println("Most occuring element in array "  +mostoccur);
       }  
   }
