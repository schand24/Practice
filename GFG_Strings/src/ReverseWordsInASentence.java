
public class ReverseWordsInASentence {
	void reverseSentense(String input){
		input = reverse(input.toCharArray(),0,input.length()-1);
		//System.out.println(input);
		String[] arr = input.split("$");
		StringBuffer out = new StringBuffer();
		for(String s : arr){
			//System.out.println(s);
			out.append(reverse(s.toCharArray(),0,s.length()-1));
			out.append("$");
		}
		System.out.println(out.toString().length());
		System.out.println(out.toString());
	}
	String reverse1(char[] input,int l, int r){
		
		for(int i = l; i<=(l+r)/2; i++){
			char temp = input[i];
			input[i] = input[r];
			input[r] = temp;
			r--;
		}
		return new String(input);
	}
	String reverse(char[] input, int l, int r){
		StringBuffer b = new StringBuffer();
		while(r>=l){
			b.append(input[r--]);
		}
		return b.toString();
	}
}
