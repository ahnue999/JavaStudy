public class Nov25_3
{
	public static class Product
	{
		private String name;
		private double price;

		Product(String name, double price)
		{
			this.name = name;
			this.price = price;
		}

		public void displayInfo()
		{
			System.out.printf("Product Name: %s, Cost: %.2f\n", name, price);
		}

	}

	public static class Store
	{
		private Product[] products;
		private int count;


		Store()
		{
			count = 0;
			products = new Product[100];
		}

		public void addProduct(Product p)
		{
			products[count] = p;
			count ++;
		}

		public void reduce()
		{
			for (Product p : products)
			{
				if (p == null)
					break;
				p.price = p.price - p.price * 0.1;
			}
			System.out.println("10% sale!!!");
		}

		public void displayInfo()
		{
			for (Product p : products)
			{
				if (p == null)
					break;
				p.displayInfo();
			}
		}
	}
	public static void main(String[] args)
	{
		Product p1 = new Product("Book", 37);
		Product p2 = new Product("Shampoo", 24);
		Product p3 = new Product("Phone", 1999);
		Product p4 = new Product("nani", 100);

		Store myStore = new Store();

		myStore.addProduct(p1);
		myStore.addProduct(p2);
		myStore.addProduct(p3);
		myStore.addProduct(p4);

		myStore.displayInfo();

		myStore.reduce();
		myStore.displayInfo();
		myStore.reduce();
		myStore.displayInfo();
		myStore.reduce();
		myStore.displayInfo();

	}
}
