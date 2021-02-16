package graph;

/**
 * Graph representation of square.
 * <P>
 * A square is represented by two points: the lower left and the upper right.
 * 
 * <br>
 * <img alt="Square" src="data:image/png;base64,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">
 * 
 * @author rsant
 *
 */
public class Square implements Gobject {

	/**
	 * Lower left point
	 */
	private double llx,lly;
	
	/**
	 * Upper right point
	 */
	private double urx,ury;
	
	/**
	 * Even if other corners are given, the lower left and upper right are stored.
	 * 
	 * @param fromX  lower left corner abscissa 
	 * @param fromY lower left corner ordinate
	 * @param toX upper right corner abscissa
	 * @param toY upper right corner ordinate
	 */
	public Square(double fromX, double fromY, double toX, double toY) {
		llx= fromX<=toX?fromX:toX;
		lly= fromY<=toY?fromY:toY;
		urx= fromX<=toX?toX:fromX;
		ury= fromY<=toY?toY:fromY;

	}
	/**
	 * {@inheritDoc}
	 *Determine if a point is inside, outside o in the Square border.
	 *
	 */
	public int belongs(double x, double y) {
		if (x<llx || x>urx || y<lly || y>ury) return OUTSIDE;
		if (llx<x &&  x<urx  && lly<y && y<ury) return INSIDE;
		return BORDER;
	}
	/**
	 * {@inheritDoc}
	 * Square border consists of 4 points.
	 * 
	 */
	public double[][] border() {
		return new double[][] {
			new double[] {llx,lly },
			new double[] {llx,ury },
			new double[] {urx,ury },
			new double[] {urx,lly },
		};

	}
	
	/**
	 * Compare two squares.
	 * 
	 * @param s square to compare
	 * @return if both squares have the same internal representation
	 */
	public boolean equals(Square s)
	{
		return llx==s.llx && urx==s.urx && lly==s.lly && ury==s.ury;
	}
	


}
