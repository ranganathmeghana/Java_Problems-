
public class ReverseWordsSentence {
	
	public static void main(String[] args) {
		
		ReverseWordsSentence obj=new ReverseWordsSentence();
		String s1= obj.reverseWords("My name is Meghana");
		System.out.println(s1);
		
	}

	 public String reverseWords(String s) {
	    
		 StringBuilder ouBuilder= new StringBuilder();
		 String[] words = s.split("\\s+");
		 
		 for(String word: words){
			 
			 StringBuilder s1= new StringBuilder().append(word).reverse();
			 ouBuilder.append(s1 + " ");
			 
		 }
		 
	return ouBuilder.toString().trim();
		 

	 }
}
