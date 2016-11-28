
public class CommonDivisors {
	
	public int findCommonDivisors(int a, int b){
		int divisors = 0; 
		if(a < b){
			divisors = findDivisors(a);
			if(b%a == 0)
				return divisors+ 1; 
			else 
				return divisors;
		}
		else{
			divisors = findDivisors(b);
			if(a%b == 0)
				return divisors + 1;
			else 
				return divisors;
		}
	}
	public int findDivisors(int num){
		int count = 0;
		for(int i =1 ; i< num; i++){
			if(num % i == 0)
				count++;
		}
		return count;
	}

}
