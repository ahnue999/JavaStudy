import java.util.ArrayList;

public class Ex3
{
	public static void main(String[] args)
	{
		ArrayList<Animal> shelter = new ArrayList<Animal>();

		Dog doggy = new Dog("Bobby", 3);
		Cat nyanko = new Cat("neko", 2);

		shelter.add(doggy);
		shelter.add(nyanko);

		for (Animal animal : shelter)
		{
			animal.makeSound();
		}
	}
	public static class Animal
	{
		protected String name;
		protected int age;

		public Animal(String name, int age)
		{
			this.name = name;
			this.age = age;
		}

		public void makeSound()
		{
			System.out.println("Animal makes a noise");
		}

		public void sleep()
		{
			System.out.println("Zzzz...");
		}
	}

	public static class Dog extends Animal
	{
		public Dog(String name, int age)
		{
			super(name, age);
		}

		@Override
		public void makeSound()
		{
			System.out.println("Woof! Woof!");
		}

		public void fetch()
		{
			System.out.println("Fetching the ball!");
		}
	}

	public static class Cat extends Animal
	{
		public Cat(String name, int age)
		{
			super(name, age);
		}

		@Override
		public void makeSound()
		{
			System.out.println("Meow!");
		}

		public void scratch()
		{
			System.out.println("Sharpening claws");
		}
	}
}
