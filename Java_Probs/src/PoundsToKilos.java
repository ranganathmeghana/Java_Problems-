
public class PoundsToKilos {
	
	public double poundstokilos(int pounds){
		
		double weight = 0;
		
		weight = pounds * 0.45359237;
		
		return weight;
		
	}
	
	public static void main(String[] args) {
		
		PoundsToKilos kilos = new PoundsToKilos();
		System.out.println(kilos.poundstokilos(119));
	}

}
