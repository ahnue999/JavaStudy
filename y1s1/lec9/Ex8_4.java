import java.util.Scanner;

public class Ex8_4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		float length, width;

		System.out.println("Enter the rectangle's length and width");
		length = input.nextFloat();
		width = input.nextFloat();

		Rectangle rec = new Rectangle(length, width);

		System.out.printf("Rectangle has %.2f length and %.2f width\n", rec.getLength(), rec.getWidth());
		System.out.printf("Perimeter of rectangle is %.2f\n", rec.perimeter());
		System.out.printf("Area of rectangle is %.2f\n", rec.area());
	}
	public static class Rectangle
	{
		private float length = 1;
		private float width = 1;

		// Setters
		public void setLength(float length)
		{
			if (length > 0 && length < 20)
				this.length = length;
		}
		public void setWidth(float width)
		{
			if (width > 0 && width < 20)
				this.width = width;
		}

		// Getters
		public float getLength()
		{
			return (this.length);
		}
		public float getWidth()
		{
			return (this.width);
		}

		public Rectangle(float length, float width)
		{
			setLength(length);
			setWidth(width);
		}

		public float perimeter()
		{
			return (2 * getLength() + 2 * getWidth());
		}

		public float area()
		{
			return (getLength() * getWidth());
		}
	}
}
