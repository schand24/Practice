import java.lang.Math;

public class CommonDivisors {
	
	public int findCommonDivisors(int a, int b){
		int divisors = 0; 
		int min = Math.min(a, b);
		for(int i = 1; i<= min; i++){
			if(a%i == 0 && b%i == 0){
				divisors++;
			}
		}
		return divisors;
	}
}
