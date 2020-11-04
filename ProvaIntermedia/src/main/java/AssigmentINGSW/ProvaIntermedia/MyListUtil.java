package AssigmentINGSW.ProvaIntermedia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListUtil {
	
	public static void main(String[] args) {
		
		List<Integer> Interi = new ArrayList<Integer>();
		
		Interi.add(2);
		Interi.add(5);
		Interi.add(4);
		Interi.add(3);
		
		
	}
	
	public List<Integer> crescente (List<Integer> i) {
		
		Collections.sort(i);
		return i;
	}
	
	public List<Integer> inverti (List<Integer> i) {
		
		Collections.reverse(i);
		return i;
	}
}
	
