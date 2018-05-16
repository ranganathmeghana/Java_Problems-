package Chapter1;

public class CheckCharacterCount {
	
	public boolean checkCharacterSame(String str1,String str2){
		
		int[] array=new int[str1.length()];
		
		for(int i=0;i<str1.length();i++){
			
			int ascii=(int)str1.charAt(i);
			array[ascii]++;	
		}
		
		return false;
		
	}

}
