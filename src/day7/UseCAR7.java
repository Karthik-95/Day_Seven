package day7;

public class UseCAR7 {
	public static void main(String[]args) {
		CAR car1=new CAR();
		car1.brand="Audi";
		car1.price=1500000;
		car1.colour="ASH";
		CAR car2=new CAR();
		car2.brand="Innova";
		car2.price=6000000;
		car2.colour="Red";
		if(car1.colour.charAt(0)==car2.colour.charAt(0)) {
			System.out.println("first letters are same");
		}
		else {
			System.out.println("first letters are not same");
		}
		if(car1.price>=2000000) {
			System.out.println(car1.price+10000);
			
		}
		else {
			System.out.println(car1.price-10000);
		}
		if(car2.price>=2000000) {
			System.out.println(car2.price+10000);
		}else {
			System.out.println(car2.price-10000);
		}
	}

}
