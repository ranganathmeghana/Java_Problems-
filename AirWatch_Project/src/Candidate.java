import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Candidate {
	
	public static void main(String[] args) {
		
		String[] votesString= new String[]{"meghana","mugdha","upas","meghana","anjali","upas","upas"};

		Candidate candidate=new Candidate();
		candidate.electionWinner(votesString);
		
		
	}
	
	static String electionWinner(String[] votesString) {
        HashMap<String, Integer> map = new HashMap<>();
        int maximum = 1;
        for(String candidateName: votesString){
            if(map.containsKey(candidateName)){
                int votes = map.get(candidateName) + 1;
                map.put(candidateName, votes);
                if (votes > maximum){
                    maximum = votes;
                }
            } else {
                map.put(candidateName, 1);
            }
        }
        
        int max=0; 
        List<String> candidates = new ArrayList<>();
        for (String candidateName :map.keySet()){
            if (map.get(candidateName) == maximum){
                candidates.add(candidateName);
                
            }
        }
        Collections.sort(candidates);
        System.out.println(candidates.get(candidates.size() -1 ));
        return candidates.get(candidates.size() -1 );

    }


}
