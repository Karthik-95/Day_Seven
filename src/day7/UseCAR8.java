package day7;

public class UseCAR8 {
	public static void main(String[]args) {
		CAR car=new CAR();
		car.brand="BMW";
		car.price=2000000;
		car.colour="Black";
		CAR car1=new CAR();
		car1.brand="Audi";
		car1.price=1500000;
		car1.colour="ASH";
		CAR car2=new CAR();
		car2.brand="Innova";
		car2.price=6000000;
		car2.colour="Red";
		String a=" is start with I";
		String b=" is end with i";
		if(car1.brand.startsWith("I")) {
			System.out.println(car1.brand+a);
		}
		else if(car.brand.startsWith("I")) {
			System.out.println(car.brand+a);
		}
		else if(car2.brand.startsWith("I")) {
			System.out.println(car2.brand+a);
		}
		if(car.brand.endsWith("i")) {
			System.out.println(car.brand+b);
		}
		else if(car1.brand.endsWith("i")) {
			System.out.println(car1.brand+b);
		}
		else if(car2.brand.endsWith("i")) {
			System.out.println(car2.brand+b);
		}
		if(car1.brand.contains("a")||car1.brand.contains("e")||car1.brand.contains("i")||car1.brand.contains("o")||car1.brand.contains("U")) {
			System.out.println(car1.brand+" contains vowel");
		}
		else {
			System.out.println(car1.brand+" not contain vowel");
		}

			
		}

}
