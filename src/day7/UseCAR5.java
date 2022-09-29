package day7;

public class UseCAR5 {
	public static void main(String[]args) {
		CAR car1=new CAR();
		car1.brand="Audi";
		car1.price=1500000;
		car1.colour="ASH";
		CAR car2=new CAR();
		car2.brand="Innova";
		car2.price=6000000;
		car2.colour="Red";
		if(car1.colour.equals(car2.colour)) {
			System.out.println("Colours are equal");
		}
		else {
			System.out.println("Colours are not Equal");
		}
	}

}
