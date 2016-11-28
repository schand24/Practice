
public class PerfectReversibleString {

	public boolean findIfPerfectReversible(String input){
		int len = input.length(); boolean flag = true;
		for(int i = 0; i<len;i++ ){
			for(int j = i; j<len; j++){
				StringBuffer output = new StringBuffer();
				for(int k = i; k<=j; k++){
					output.append(input.charAt(k));
					
				}
				System.out.println(output);
				System.out.println(output.reverse());
				System.out.println(input.indexOf(output.reverse().toString()));
				System.out.println("-------------------");
				if(input.indexOf(output.reverse().toString())<0){
					return false;
				}
			}
		}
		return true;
	}
}
