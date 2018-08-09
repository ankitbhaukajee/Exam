package exam;

public class RootProvider {
	private static double[] calculateRoot(double...nums){
		
		for (int d=0;d<nums.length;d++) {
			nums[d]=Math.sqrt(nums[d]);
			
		}
		return nums;
	}
	private static double[] myCalculateRoot(double...nums){
		for (int d=0;d<nums.length;d++) {
			nums[d]=sqrt(nums[d]);
			
		}
		
		
		return nums;		
		
	}
	private static double sqrt( double num){
		double t;
		 
		double squareRoot = num / 2;
	 
		if (num==0){
			return 0;
		}
		if(num<0){
			return Double.NaN;
		}
		do {
			t = squareRoot;
			squareRoot = (t + (num/t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	
	
	
	public static void main(String [] args){
		
		double []roots= myCalculateRoot(-2,0,1.0,9);
		for(double root: roots)
			System.out.println(root);
		
	}

}

// Time Complexity is 0(n)