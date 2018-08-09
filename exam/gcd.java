package exam;

import java.util.Scanner;

public class gcd {
	private static double GCD(double a, double b){
			
			if (b==0)
				return a;
			return GCD(b,a%b);
		}
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		double first_num=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		double second_num=sc.nextInt();
		
		double result=GCD(first_num,second_num);
		System.out.println(result);
		sc.close();
	}

}
//Time COmplexity is 0(log n)
