
public class ReverseString {
	
	public String reverseString(String str)
	{
		StringBuilder str1=new StringBuilder();
		char[] array=str.toCharArray();
		for(int i=array.length-1; i>=0; i--){
			
			str1.append(array[i]);
			
		}
		return str1.toString();
	}
	
	public static void main(String[] args) {
		
		ReverseString obj=new ReverseString();
		String s=obj.reverseString("meghana");
		System.out.println(s);
	}
}
