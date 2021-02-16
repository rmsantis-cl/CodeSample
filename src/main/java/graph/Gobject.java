package graph;

/**
 * Graphic Object.
 * 
 * 
 * <P>
 * Interface to define all functions to implement by an Object
 * to be considered Graphic
 * 
 * @author rsant
 * @since 1.0
 *
 */
public interface Gobject {
	
	
	/**
	 * Given a point indicates if the point is inside, outside or in the border of a geometric object.
	 * 
	 * @param x ordinate from point 
	 * @param y abscissa from point

	 * @return &lt;0 inside <br> &gt;0 outside <br> =0 border
	 */
	int  belongs(double x, double y);
	
	
	/**
	 * Returns an array of points ( double[2] ) representing the border of an geometric object.
	 * 
	 * The object can be drawn by connecting each point with the next, and connect the last with the first.
	 * 
	 * @return double[][]: array of double[2] representing the object border
	 * @throws GraphException when the object can be drawn using straight lines only
	 */
	double[][] border() throws GraphException;
	
	
	public static final int INSIDE=-1;
	public static final int OUTSIDE=1;
	public static final int BORDER=0;

}
