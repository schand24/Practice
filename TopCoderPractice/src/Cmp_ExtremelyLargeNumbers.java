import java.math.BigInteger;

public class Cmp_ExtremelyLargeNumbers {
	
	public void cmp(String a, String b){
		int pos = a.indexOf('!');
		BigInteger a_num = new BigInteger("0");
		BigInteger b_num = new BigInteger("0");
		int a_count=0,b_count=0;
		if(pos > 0){
			a_num =  BigInteger.valueOf(Long.parseLong(a.substring(0, pos)));
			a_count = a.lastIndexOf('!') - pos + 1;
		}
		else{
		a_num =  BigInteger.valueOf(Long.parseLong(a));
		}
		pos = b.indexOf('!');
		if(pos>0){
			b_num =  BigInteger.valueOf(Long.parseLong(b.substring(0, pos)));
			b_count = a.lastIndexOf('!') - pos + 1;
		}
		else{
			b_num =  BigInteger.valueOf(Long.parseLong(b));
		}
		while(a_count != 0){
			a_num = findFact(a_num);
			a_count--;
		}
		
		while(b_count != 0){
			b_num = findFact(b_num);
			b_count--;
		}
		if(a_num.compareTo(b_num) < 0){
			System.out.println("x<y");
		}
		else if(a_num.compareTo(b_num)>0){
			System.out.println("x>y");
		}
		else{
			System.out.println("x==y");
		}
	}
	public BigInteger findFact(BigInteger num){
		BigInteger fact = new BigInteger("1");
		if(!num.equals(0)){
			for(int i = num.intValue(); i>=1 ; i--){
				fact = fact.multiply(BigInteger.valueOf(i));
			}
		}
		return fact;
	}

}
