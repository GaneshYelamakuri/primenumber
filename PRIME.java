import java.util.Scanner;
class PrimeNum
{
	public static void main(String [] args)
	{
	  
	 Scanner scn= new Scanner(System.in);
	    System.out.println(" enter a number:");
	int n= scn.nextInt();
	
	 boolean flag= true;

 	 for (int i=2; i<=n/2; i++)
	{
	 if (n%i==0)
	{
	 	flag= false;
	 System.out.println( n +" it is not a prime Number");
		break;
	}
	}
	if (flag)    System.out.println( n +"it is a prime number");
	}
}