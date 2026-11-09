public class Nov25_2
{
	public static class Animal
	{
		private String name;
		private int age;
		private String Live_in;
		private static int count = 0;
		private int order;

		Animal()
		{
			name = "Unnamed Animal";
			age = -1;
			Live_in = "Unknown";
			count ++;
			order = count;
		}

		Animal(String name, int age, String Live_in)
		{
			this.name = name;
			this.age = age;
			this.Live_in = Live_in;
			count ++;
			order = count;
		}

		public String getName()
		{
			return (name);
		}
		public int getAge()
		{
			return (age);
		}
		public String getLive_in()
		{
			return (Live_in);
		}

		public void setName(String name)
		{
			this.name = name;
		}
		public void setAge(int age)
		{
			this.age = age;
		}
		public void setLive_in(String Live_in)
		{
			this.Live_in = Live_in;
		}

		public void printDetails()
		{
			System.out.printf("Animal%d:%s,%dyears,Live in %s\n", order, name, age, Live_in);
		}
	}

	public static void main(String[] args)
	{
		Animal ani1 = new Animal();
		Animal ani2 = new Animal("Doggy", 4, "Swis");

		ani1.printDetails();
		ani2.printDetails();
	}
}
