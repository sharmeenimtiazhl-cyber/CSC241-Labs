public class Product{
	private String id;
	private String name;
	private double price;
	private int quantity;
	Date2 md;

	private static double maxPrice;
	private static double minPrice;
	private static int counter = 0;

	{
		this.id = String.format("P%03d", counter++);
	}

	public Product(String name, double price, int quantity){
		this(name, price, quantity, new Date2(1,1,2002));
	}

	public Product(String name, double price, int quantity, Date2 md){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.md = md;
		if(counter == 1){
			maxPrice = price;
			minPrice = price;
		}
		if(counter > 1 && price > maxPrice) maxPrice = price;
		if(counter > 1 && price < minPrice) minPrice = price;
	}


	public static double getMaxPrice(){
		return maxPrice;
	}

	public static double getMinPrice(){
		return minPrice;
	}

	public void displayProduct(){
		System.out.println("\nID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		md.displayDate();
		System.out.println("Maximum Price: " + getMaxPrice());
		System.out.println("Minimum Price: " + getMinPrice());
	}
}