import java.util.Scanner;
class Product{
	String name;
	double price;
	
	Product(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	void display(){
		System.out.println(this.name+" "+this.price);
	}
}
class ProductDetails{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Enter product name: ");
		String name = sc.next();
		System.out.print("Enter product price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		product.display();*/
		
		System.out.print("Number of products: ");
		int size = sc.nextInt();
		
		Product[] products = new Product[size];
		
		System.out.println("Enter "+size+" product details: ");
		for(int i=0; i<size; i++){
			System.out.print("Enter product name: ");
			String name = sc.next();
			System.out.print("Enter product price: ");
			double price = sc.nextDouble();
			
			/*Product product = new Product(name, price);
			products[i] = product;*/
			
			products[i] = new Product(name, price);
		}
		/*System.out.println("\nAvailbale Products: ");
		for(int i=0; i<size; i++){
			products[i].display();
		}*/
		
		double totalPrice = 0;
		double avgPrice = 0;
		for(Product temp : products){
			totalPrice += temp.price;
		}
		avgPrice = totalPrice / size;
		System.out.println("\nAverage Price is: "+avgPrice);
		
		int index = 0;
		double highPrice = products[index].price;
		for(int i=1; i<size; i++){
			if(products[i].price > highPrice){
				index = i;
				highPrice = products[i].price;
			}
		}
		System.out.println("Product with highest price is: ");
		products[index].display();
	}
}