package exam;

import java.util.Scanner;

public class Reverse {
	public static String getReverse(String input){
		StringBuilder input1 = new StringBuilder();

        input1.append(input);

        input1 = input1.reverse();
        String reverse_string = input1.toString();
        //System.out.println(myString);
        //double value = Double.parseDouble(myString);
        return reverse_string;
		
	}
	
	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		String nums=sc.nextLine();
		String reversed_string=getReverse(nums);
		if (reversed_string.contains(".")){
			double value = Double.parseDouble(reversed_string);
			System.out.println(value);
		}
		else{
			int value= Integer.parseInt(reversed_string);
			System.out.println(value);
		}
		sc.close();

		
	}
}
//Time Complexity is 0(1)
