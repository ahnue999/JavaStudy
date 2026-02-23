public class Ex1
{
	public static void main(String[] args)
	{
		Car myCar = new Car("Toyota", "Sequoia", 2001);
		Car hisCar = new Car("Honda", "CR-V", 1995);

		myCar.accelerate(50.5);
		System.out.println("Car speed: " + myCar.getSpeed());
	}
	public static class Car
	{
		String make;
		String model;
		int year;
		double speed;

		public Car(String make, String model, int year)
		{
			this.make = make;
			this.model = model;
			this.year = year;
		}

		public void accelerate(double i)
		{
			speed += i;
		}
		public void brake(double d)
		{
			speed -= d;
			if (speed > 0)
				speed = 0;
		}

		// Getters
		public String getModel()
		{
			return(model);
		}
		public double getSpeed()
		{
			return(speed);
		}

		// Setters
		public void setSpeed(double speed)
		{
			this.speed = speed;
		}

	}
}
