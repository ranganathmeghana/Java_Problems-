package Chapter1;



public class IsUnique {
	
	public boolean isBoolean(String str){
		
		int checker=0;
		int val=0;
		
		if(str.length()>256){
			
			System.out.println("repeated characters is strings");

			return false;
		}
		
	for(int i=0; i<str.length(); i++)
		
	{
		val=str.charAt(i)-'a';
	
		if((checker & (1<<val) )>0){
			
			System.out.println("repeated characters is strings");
			return false;
			
		}
		
		checker= checker | (1 << val);

	}
	
	System.out.println("unique");

	return true;
	
	}
	
	
	public static void main(String[] args) {
		
		IsUnique obj=new IsUnique();
		obj.isBoolean("meghana");
		
	}

}
