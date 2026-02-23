import java.util.Scanner;

public class Ex4 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;

		System.out.println("Enter grade for subject1");
		a = input.nextInt();
		System.out.println("Enter grade for subject2");
		b = input.nextInt();
		System.out.println("Enter grade for subject3"); c = input.nextInt();
		GradeBook myBook = new GradeBook(a, b, c);

		System.out.printf("The total is: %.2f%n", myBook.getTotal());
		System.out.printf("The rate is: %.2f%%%n", myBook.rate());
		System.out.printf("Rate of Appreciation: %s%n", myBook.appreciation());
	}
	public static class GradeBook {
		float subject1, subject2, subject3;

		public GradeBook(float s1, float s2, float s3) {
			this.subject1 = s1;
			this.subject2 = s2;
			this.subject3 = s3;
		}

		public float getTotal() {
			float total = 0;
			total += this.subject1 + this.subject2 + this.subject3;
			return total;
		}

		public float rate() {
			return (getTotal()/300);
		}
		public String appreciation() {
			if (this.rate() >= .85)
				return ("Dist");
			else if (this.rate() >= .75)
				return ("Very Good");
			else if (this.rate() >= .65)
				return ("Good");
			else if (this.rate() >= .50)
				return ("Pass");
			else
				return ("Failed");
		}
	}
	public static void cls() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}

