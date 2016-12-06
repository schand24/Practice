import java.util.Arrays;

public class BinaryCode {
		
	public String[] decode(String encode){
		String[] output = new String[2];
		output[0] = dcodeUtil(encode, 0);
		output[1] = dcodeUtil(encode,1);
		
		return output;
	}
	public String dcodeUtil(String message, int num){
		int len = message.length();
		int[] p =new int[len];
		p[0] = num;
		p[1] = Character.getNumericValue(message.charAt(0));
		for(int i = 2; i< len;i++){
			int temp = Character.getNumericValue(message.charAt(i-1)) - p[i-1] - p[i-2];
			if(temp <= 3)
				p[i] = temp;
			else
				return "NONE";
		}
		return Arrays.toString(p);
	}
}