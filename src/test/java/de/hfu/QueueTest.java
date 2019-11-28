package de.hfu;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {

	Queue testQ = new Queue(3);

	
	@Before
	public void follQueue() {
		for (int i = 0; i<45; i++) {
			testQ.enqueue(i);
		}
	}
	
	
	
//	@Test
//	public void testenqueue()
//	{
//
//		try {
//			for(int i = 0 ; i<3; i++) {
//			assertEquals(testQ.enqueue(i));
//			}
//		} catch (ArithmeticException e) {
//
//		}
//	}
	
	@Test
	public void testdequeue()
	{

		try {
			System.out.println();
			assertEquals(0,testQ.dequeue());
		} catch (ArithmeticException e) {

		}
	}

}
