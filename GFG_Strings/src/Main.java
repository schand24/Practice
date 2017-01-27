
public class Main {

	public static void main(String[] args) {
	
		//Strings: 10 -> Print list items containing all characters of a given word
//		String[] list = {"geeksforgeeks", "unsorted", "sunday",
//                "just", "sss" };
//		String str = "sun";
//		
//		GetListItemshasAllCharacters g = new GetListItemshasAllCharacters();
//		g.listAllListItems(list, str);
		
		//Strings: 11 -> Reverse words in a given string
		
//		String input = "a$$reverse$a$string";
//		ReverseWordsInASentence r = new ReverseWordsInASentence();
//		r.reverseSentense(input);
		
		
//		Run Length Encoding
//		Given an input string, write a function that returns the Run Length Encoded string for the input string.
//		For example, if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6”.
		
		String input = "wwwwaaadexxxxxxp";
		RunLengthEncoding r = new RunLengthEncoding();
		r.findRunLengthEncoding1(input);
		
	}

}
