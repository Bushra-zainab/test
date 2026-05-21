package constructor;

public class Point2 {

	// verbose constructor

	private int x;
	private int y;

	public Point2() {
        this.x = 0;
        this.y = 0;
    }

	public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distance() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public double distance(Point2 point) {
		return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
	}

	public double distance(int x, int y) {
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}

}
