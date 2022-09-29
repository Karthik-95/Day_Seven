package day7;

public class Demo2 {
	public static void main(String[]args) {
		int num1=52;
		int num2=65;
		String maths="subract";
		switch(maths) {
		case "addition":System.out.println(num1+num2);break;
		case "subract":System.out.println(num1-num2);break;
		case "multiply":System.out.println(num1*num2);break;
		case "division":System.out.println(num1/num2);break;
		case "modulas":System.out.println(num1%num2);break;
		default:System.out.println("Not available");break;
		
		}
	}

}
