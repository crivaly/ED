package org.institutoserpis.ed;

import static org.junit.Assert.*;


import org.junit.Test;

public class VectorTest {

	@Test
	public void testMin() {
		//fail("Not yet implemented");
//		int [] v= new int []{5,3,1,9,45};
//		int menor= Vector.min(v);
//		assertEquals(1, menor);
		
		//primera posición
		assertEquals(2,Vector.min(new int []{2,6,25,41,4}));
		//última posición
		assertEquals(4,Vector.min(new int []{8,6,25,41,4}));	
		//intermedia posición
		assertEquals(6,Vector.min(new int []{9,6,25,41,10}));
		
	}

	@Test
	public void testIndexOf() {
		//fail("Not yet implemented");
		
		//primera posición
		int[] v= new int []{12,33,15};
//		int value = 12;
		assertEquals(0, Vector.indexOf(v, 12));    //0=primera posición
												   //12=valor que hay en esa posición
		//última posición
		assertEquals(2, Vector.indexOf(v, 15));
		
		//intermedia posición
		assertEquals(1, Vector.indexOf(v, 33));
		
		//nula posición
		assertEquals(-1, Vector.indexOf(v,100));	//devuelve -1 porque no encuentra el valor 100
		
	}

}
