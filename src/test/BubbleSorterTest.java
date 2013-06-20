package test;

import static org.junit.Assert.assertEquals;
import main.IntBubbleSorter;

import org.junit.Before;
import org.junit.Test;

public class BubbleSorterTest {
	IntBubbleSorter intSorter;
	
	@Before
	public void beforeAll(){
		intSorter = new IntBubbleSorter();
	}
	
	@Test
	public void returnsZeroOperationsForSingleElementList() {
		int[] ints = new int[1];
		ints[0] = 1;
		
		assertEquals(0, intSorter.sort(ints));
	}
	
	@Test
	public void willPlaceSmallerIntFirst(){
		int[] ints = new int[2];
		ints[0] = 15;
		ints[1] = 5;
		
		intSorter.sort(ints);
		
		assertEquals(5, ints[0]);
	}

}
