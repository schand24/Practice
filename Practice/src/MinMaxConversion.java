import java.util.Scanner;

public class MinMaxConversion {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tests = Integer.parseInt(sc.nextLine());
		for(int i = 0; i< tests; i++){
			String input = sc.nextLine();
			System.out.println(findSumofMinMax(input));
		}
		sc.close();
	}
	
	public static int findSumofMinMax(String number){
		char[] input = number.toCharArray();
		StringBuffer maxNum = new StringBuffer();
		StringBuffer minNum = new StringBuffer();
		for(char c : input){
			if(c == '5' || c == '6'){
				maxNum.append('6');
				minNum.append('5');
			}
			else{
				maxNum.append(c);
				minNum.append(c);
			}
		}
		int max = Integer.parseInt(maxNum.toString());
		int min = Integer.parseInt(minNum.toString());
		return max+min;
	}

}
