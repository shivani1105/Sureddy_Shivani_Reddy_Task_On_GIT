package demo;

import java.util.Scanner;

public class PrimeNumber {
    public static int isPrime(int num){
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
            return 0;
        }
        return 1;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=1)
		   System.out.println("not a prime");
	    else if(n==2)
	       System.out.println("yes, it is a prime");
	    else if(isPrime(n)==1)
	       System.out.println("yes, it is a prime");
	    else 
	       System.out.println("not a prime");
		sc.close();
	}
}
