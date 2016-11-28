
public class GoogleExam {
	
	public int findMaxDigit(String num){
		int len = num.length();
		int max = 0;
		
		for(int i =0; i<len-1; i++ ){
			StringBuffer out = new StringBuffer(num);
			int a = Character.getNumericValue(num.charAt(i));
			int b = Character.getNumericValue(num.charAt(i+1));
			int temp = (a + b);
			String c = (temp - (temp/2))+"";
			out.replace(i, i+2,c);
			//System.out.println(out.replace(i, i+1,c));
			if(max < Integer.parseInt(out.toString()))
				max = Integer.parseInt(out.toString());
			
		}
		return max;
	}

}
