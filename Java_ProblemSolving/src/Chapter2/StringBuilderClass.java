package Chapter2;

public class StringBuilderClass {
	
	public void joinWords(String words[]){
		
		StringBuilder sentence=  new StringBuilder(" ");
		for(String word: words){
			
			sentence.append(word);
		}
		
		System.out.println(sentence);
	}
	
	public static void main(String[] args) {
		
		String[] wordsList= {"meghana", "mugdha","anjali"};
		StringBuilderClass obj=new StringBuilderClass();
		
		obj.joinWords(wordsList);
	}

}
