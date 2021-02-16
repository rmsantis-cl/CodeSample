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
public class CircleTest {

	/**
	 * Test method for {@link graph.Circle#belongs(double, double)}.
	 */
	@Test
	public void testBelongs() {
		Circle c=new Circle(0,0,1.0);
		assertEquals(c.belongs(0, 0),Gobject.INSIDE);
		assertEquals(c.belongs(0.5, 0.5),Gobject.INSIDE);
		assertEquals(c.belongs(1.0, 0),Gobject.BORDER);
		assertEquals(c.belongs(-1.0, 0),Gobject.BORDER);
		assertEquals(c.belongs(2.0, 0),Gobject.OUTSIDE);
		assertEquals(c.belongs(-2.0, 0),Gobject.OUTSIDE);
		assertEquals(c.belongs(10,10),Gobject.OUTSIDE);
	}

	/**
	 * Test method for {@link graph.Circle#border()}.
	 */
	@Test(expected=GraphException.class)
	public void testBorder() throws Exception{
		Circle c=new Circle(0,0,10);
		double d[][]=c.border();
		fail("Must raise GraphException");
	}

}
