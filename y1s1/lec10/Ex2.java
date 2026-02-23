import java.lang.Math;

public class Ex2
{
	public static void main(String[] args)
	{
		Square s = new Square(0, 0, 0, 5, 5, 5, 5, 0);
		Rectangle r = new Rectangle(0, 0, 0, 3, 6, 3, 6, 0);
		Parallelogram p = new Parallelogram(0, 0, 1, 3, 5, 3, 4, 0);
		Trapezoid t = new Trapezoid(0, 0, 1, 3, 5, 3, 6, 0);

		System.out.println("Rectangle details");
		r.printShape();
		System.out.println("Rectangle area: " + r.area());

		System.out.println("Square details:");
		s.printShape();
		System.out.println("Square area: " + s.area());

		System.out.println("Parallelogram details:");
		p.printShape();
		System.out.println("Parallelogram area: " + p.area());

		System.out.println("Trapezoid details:");
		t.printShape();
		System.out.println("Trapezoid area: " + t.area());

	}
	public static class Point
	{
		private int x;
		private int y;

		public Point(int x, int y)
		{
			setX(x);
			setY(y);
		}

		public void setX(int x)
		{
			this.x = x;
		}
		public void setY(int y)
		{
			this.y = y;
		}

		public int getX()
		{
			return x;
		}

		public int getY()
		{
			return y;
		}

		public String pointString()
		{
			return String.format("(%d, %d)", x, y);
		}

		public static float distance(Point a, Point b)
		{
			return ((float) Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2)));
		}
	}
	public static class Quadrilateral
	{
		private Point a, b, c, d;

		public Quadrilateral(int a1, int a2, int b1, int b2, int c1, int c2, int d1, int d2)
		{
			setA(a1, a2);
			setB(b1, b2);
			setC(c1, c2);
			setD(d1, d2);
		}

		// Setters
		public void setA(int x, int y)
		{
			a = new Point(x, y);
		}
		public void setB(int x, int y)
		{
			b = new Point(x, y);
		}
		public void setC(int x, int y)
		{
			c = new Point(x, y);
		}
		public void setD(int x, int y)
		{
			d = new Point(x, y);
		}

		// Getters
		public Point getA()
		{
			return a;
		}
		public Point getB()
		{
			return b;
		}
		public Point getC()
		{
			return c;
		}
		public Point getD()
		{
			return d;
		}

		public void printShape()
		{
			System.out.printf("A: %s\nB: %s\nC: %s\nD: %s\n", a.pointString(), b.pointString(), c.pointString(), d.pointString());
		}
	}

	public static class Trapezoid extends Quadrilateral
	{
		public Trapezoid(int a1, int a2, int b1, int b2, int c1, int c2, int d1, int d2)
		{
			super(a1, a2, b1, b2, c1, c2, d1, d2);
		}

		public float area()
		{
			float lowerBase = Point.distance(getA(), getD());
			float upperBase = Point.distance(getB(), getC());
			float height = getB().getY() - getA().getY();

			return ((float) 0.5 * (lowerBase + upperBase) * height);
		}
	}

	public static class Parallelogram extends Quadrilateral
	{
		public Parallelogram(int a1, int a2, int b1, int b2, int c1, int c2, int d1, int d2)
		{
			super(a1, a2, b1, b2, c1, c2, d1, d2);
		}

		public float area()
		{
			float base = Point.distance(getA(), getD());
			float height = getB().getY() - getA().getY();
			return (base * height);
		}
	}

	public static class Rectangle extends Quadrilateral
	{
		public Rectangle(int a1, int a2, int b1, int b2, int c1, int c2, int d1, int d2)
		{
			super(a1, a2, b1, b2, c1, c2, d1, d2);
		}

		public float area()
		{
			return (Point.distance(getA(), getB()) * Point.distance(getB(), getC()));
		}
	}

	public static class Square extends Quadrilateral
	{
		public Square(int a1, int a2, int b1, int b2, int c1, int c2, int d1, int d2)
		{
			super(a1, a2, b1, b2, c1, c2, d1, d2);
		}

		public float area()
		{
			return((float) Math.pow(Point.distance(getA(), getB()), 2));
		}

	}
}
