package day7;

public class UseCAR2 {
	public static void main(String[]args) {
		CAR car=new CAR();
		car.brand="BMW";
		car.price=2000000;
		car.colour="Black";
		CAR car1=new CAR();
		car1.brand="Audi";
		car1.price=1500000;
		car1.colour="ASH";
		if(car.price<car1.price) {
			System.out.println(car1.brand);
		}
		else {
			System.out.println(car.brand);
		}
		
	}

}
