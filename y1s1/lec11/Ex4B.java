public class Ex4B
{
	public static void main(String[] args)
	{
		Drivable vehicle = new Truck();
		vehicle.start();
		vehicle.stop();
	}

	public interface Drivable
	{
		public void start();
		public void stop();
	}

	public static class Truck implements Drivable
	{
		public void start()
		{
			System.out.println("Truck engine roars to life!");
		}
		public void stop()
		{
			System.out.println("breaks squeal!");
		}
	}
}
