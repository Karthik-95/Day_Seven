package day7;

public class UseBag {
	public static void main(String[]args) {
		Bag bag1=new Bag();
		bag1.brand="tycon";
		bag1.price=300;
		bag1.color="black";
		bag1.noOfzip=4;
		Bag bag2=new Bag();
		bag2.brand="fast track";
		bag2.price=350;
		bag2.color="red";
		bag2.noOfzip=3;
		Bag bag3=new Bag();
		bag3.brand="nike";
		bag3.price=400;
		bag3.color="blue";
		bag3.noOfzip=4;
		if(bag1.price>bag2.price&&bag1.price>bag3.price) {
			System.out.println(bag1.brand);
		}
		else if(bag2.price>bag1.price&&bag2.price>bag3.price) {
			System.out.println(bag2.brand);
		}
		else {
			System.out.println(bag3.brand);
		}
	}

}
