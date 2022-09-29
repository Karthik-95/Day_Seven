package day7;

public class UseCAR4 {
	public static void main(String[]args) {
		CAR car1=new CAR();
		car1.brand="Audi";
		car1.price=1500000;
		car1.colour="ASH";
		CAR car2=new CAR();
		car2.brand="Innova";
		car2.price=6000000;
		car2.colour="Red";
		if(car1.brand.equals(car2.brand)) {
			System.out.println("Brands are Equals");
		}
		else {
			System.out.println("Brands are not Equals");
		}
	}

}
