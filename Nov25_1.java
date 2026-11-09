public class Nov25_1
{
	public static class Bus
	{
		private String brand;
		private int year;
		private int capacity;
		static private int count = 0;
		private int order;

		Bus(String brand, int year, int capacity)
		{
			this.brand = brand;
			this.year = year;
			this.capacity = capacity;
			count++;
			order = count;
		}
		public void displayInfo()
		{
			System.out.println("Bus" + order + ":" + brand + "," + year + "," + capacity + " passenger");
		}
	}

	public static void main(String[] args)
	{
		Bus bus1 = new Bus("Mercedes", 2019, 50);
		Bus bus2 = new Bus("Subaru", 2016, 8);

		bus1.displayInfo();
		bus2.displayInfo();
	}
}
