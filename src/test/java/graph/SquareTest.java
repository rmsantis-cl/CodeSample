/**
 * 
 */
package graph;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author rsant
 *
 */
public class SquareTest {

	/**
	 * Test method for {@link graph.Square#Square(int, int, int, int)}.
	 */
	@Test
	public void testSquare() throws Exception {
		/* as long as we give the same values, the squares should be equal */
		Square s0 = new Square(0.0, 0.0, 1.0, 1.0);
		Square s1 = new Square(0.0, 1.0, 1.0, 0.0);
		Square s2 = new Square(1.0, 1.0, 0.0, 0.0);
		Square s3 = new Square(1.0, 0.0, 0.0, 1.0);
		Square s4 = new Square(0.0, 0.0, 1.0, 1.0);
		assertTrue(s0.equals(s1));
		assertTrue(s0.equals(s2));
		assertTrue(s0.equals(s3));
		assertTrue(s0.equals(s4));
		assertTrue(s1.equals(s0));

	}

	/**
	 * Test method for {@link graph.Square#belongs(int, int)}.
	 */
	@Test
	public void testBelongs() {
		Square s = new Square(-10.0, -10.0, 10.0, 10.0);

		/* border points  */
		
		/* vertex */

		assertTrue(s.belongs(-10.0, -10) == 0);
		assertTrue(s.belongs(10, 10) == 0);
		assertTrue(s.belongs(-10.0, 10) == 0);
		assertTrue(s.belongs(10, -10) == 0);
		/* midle points */
		
		assertTrue(s.belongs(10.0, 0) == 0);
		assertTrue(s.belongs(0.0, 10) == 0);
		/* Internal points */
		assertTrue(s.belongs(0, 0) == -1);
		assertTrue(s.belongs(5.0, 0) == -1);
		assertTrue(s.belongs(0.0, 5.0) == -1);
		/* external points */
		
		assertTrue(s.belongs(20, 0) == 1);
		assertTrue(s.belongs(20, 10) == 1);
		assertTrue(s.belongs(20, 15) == 1);
		assertTrue(s.belongs(20, -10) == 1);
		assertTrue(s.belongs(20, -15) == 1);	
		
		assertTrue(s.belongs(-20, 0) == 1);
		assertTrue(s.belongs(-20, 10) == 1);
		assertTrue(s.belongs(-20, 15) == 1);
		assertTrue(s.belongs(-20, -10) == 1);
		assertTrue(s.belongs(-20, -15) == 1);	
		
		assertTrue(s.belongs(0,20) == 1);
		assertTrue(s.belongs(10,20) == 1);
		assertTrue(s.belongs(15,20) == 1);
		assertTrue(s.belongs(-10,20) == 1);
		assertTrue(s.belongs(-15,20) == 1);	
		
	}

	/**
	 * Test method for {@link graph.Square#border()}.
	 */
	@Test
	public void testBorder() {
		Square s = new Square(-10.0, -10.0, 10.0, 10.0);
		double[][] b = s.border();

		assertEquals(b.length,4);
		assertEquals(b[0].length,2);
		assertEquals(b[1].length,2);
		assertEquals(b[2].length,2);
		assertEquals(b[3].length,2);
		
		assertEquals(-10,b[0][0],0.0);
		assertEquals(-10,b[0][1],0.0);
		assertEquals(-10,b[1][0],0.0);
		assertEquals( 10,b[1][1],0.0);
		assertEquals(10,b[2][0],0.0);
		assertEquals(10,b[2][1],0.0);
		assertEquals( 10,b[3][0],0.0);
		assertEquals(-10,b[3][1],0.0);
	}

}
