package bounceThread;

import java.awt.geom.*;

public class Ball
{
    private static final int XSIZE = 10;
    private static final int YSIZE = 10;
    private double x;
    private double y;
    private double dx = 1;
    private double dy = 1;

    public Ball()
    {
        x = (int)(Math.random() * BallComponent.DEFAULT_WIDTH);
	y = (int)(Math.random() * BallComponent.DEFAULT_HEIGHT);
    }

    public void move(Rectangle2D bounds)
    {
	x += dx;
	y += dy;
	
	if (x < bounds.getMinX()) {
	    x = bounds.getMinX();
	    dx = -dx;
	}

	if (x + XSIZE >= bounds.getMaxX()) {
	    x = bounds.getMaxX() - XSIZE;
	    dx = -dx;
	}

	if (y < bounds.getMinY()) {
	    y = bounds.getMinY();
	    dy = -dy;
	}

	if (y + YSIZE >= bounds.getMaxY()) {
	    y = bounds.getMaxY() - YSIZE;
	    dy = -dy;
	}
    }

    public Ellipse2D getShape()
    {
	return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
    }
}
