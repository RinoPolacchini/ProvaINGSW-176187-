package AssigmentINGSW.ProvaIntermedia;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class testMyListUtil {


	static MyListUtil m;
	static List<Integer> interi;
	static List<Integer> giusto;
	
	@BeforeClass
	public static void initializeTest() {
		m = new MyListUtil();
		interi = new ArrayList<Integer>();
		interi.add(2);
		interi.add(5);
		interi.add(4);
		interi.add(3);
	}
	
	@Test
	public void testCresc() {
		giusto = new ArrayList<Integer>();
		giusto.add(2);
		giusto.add(3);
		giusto.add(4);
		giusto.add(5);
		assertEquals(giusto, m.crescente(interi));
	}
	
	@Test
	public void testInv() {
		giusto = new ArrayList<Integer>();
		giusto.add(3);
		giusto.add(4);
		giusto.add(5);
		giusto.add(2);
		assertEquals(giusto, m.inverti(interi));
	}

}
