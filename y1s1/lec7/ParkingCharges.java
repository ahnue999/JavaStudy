import java.util.Scanner;

public class ParkingCharges
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		float hours;

		System.out.println("How many hours did you park");
		hours = input.nextFloat();
		System.out.printf("Customer Parked for %.2f hours\n", hours);
		System.out.printf("Charges: %.2f\n", calculateCharges(hours));
	}
	public static float calculateCharges(float hours)
	{
		float charge = 2;

		if (hours > 3)
		{
			hours -= 3;
			charge += .5 * hours;
		}
		if (charge > 10)
			return (10);
		return (charge);
	}
}
