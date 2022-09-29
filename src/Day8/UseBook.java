package Day8;

public class UseBook {
	public static void main(String[]args) {
		Book book1=new Book();
		book1.brand="Classmate";
		book1.price=25;
		book1.noOfPages=50;
		Book book2=new Book();
		book2.brand="Surya";
		book2.price=30;
		book2.noOfPages=60;
		Book book3=new Book();
		book3.brand="Karthik";
		book3.price=35;
		book3.noOfPages=50;
		String brand=book3.brand;
		switch(brand) {
		case "Classmate":System.out.println(book1.brand.toUpperCase());break;
		case "Surya":System.out.println(book2.brand.toLowerCase());break;
		default:System.out.println(brand.substring(0,brand.length()/2));break;
		}
		System.out.println(brand.charAt(0));
		System.out.println(brand.charAt(brand.length()-2));
	}

}
