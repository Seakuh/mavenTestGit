package de.hfu;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest {
	
	@Test
	public void istErstesHalbjahr() {
		try{
			assert(Util.istErstesHalbjahr(5));
		}catch(ArithmeticException e) {
			
		}
	}
	
	

}
