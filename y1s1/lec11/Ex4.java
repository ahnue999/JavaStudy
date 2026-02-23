// Part B remaining, and maybe call area in a print statement

public class Ex4
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(3, 4);
		r.displayColor("Violet");
		System.out.println("Area: " + r.calculateArea());
	}

	public static abstract class Shape
	{
		public void displayColor(String color)
		{
			System.out.println(color);
		}

		public abstract double calculateArea();
	}

	public static class Rectangle extends Shape
	{
		double width;
		double height;

		public Rectangle(double h, double w)
		{
			height = h;
			width = w;
		}

		@Override
		public double calculateArea()
		{
			return (width * height);
		}
	}
}
