package day7;

public class UseCAR {
	public static void main(String[]args) {
		CAR car=new CAR();
		car.brand="BMW";
		car.price=2000000;
		car.colour="Black";
		CAR car1=new CAR();
		car1.brand="Audi";
		car1.price=1500000;
		car1.colour="Ash";
		CAR car2=new CAR();
		car2.brand="Innova";
		car2.price=6000000;
		car2.colour="Red";
		if(car1.price>car2.price&&car1.price>car.price) {
			System.out.println(car1.brand+" is expensive");
		}
		else if(car2.price>car.price&&car2.price>car1.price) {
			System.out.println(car2.brand+" is expensive");
		}
		else if(car.price>car1.price&&car.price>car2.price) {
			System.out.println(car.brand+" is expensive");
		}
	}

}
