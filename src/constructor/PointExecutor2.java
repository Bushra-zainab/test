package constructor;

public class PointExecutor2 {

	public static void main(String[] args) {
		Point2 first = new Point2(6, 5);
		Point2 second = new Point2(3, 1);
		System.out.println("distance(0,0)= " + first.distance());
		System.out.println("distance(second)= " + first.distance(second));
		System.out.println("distance(2,2)= " + first.distance(2, 2));
		Point2 point = new Point2();
		System.out.println("distance()= " + point.distance());

	}

}
