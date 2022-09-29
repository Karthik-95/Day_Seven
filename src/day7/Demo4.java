package day7;

public class Demo4 {
	public static void main(String[]args) {
		String a="sr";
		switch (a) {
		case "Mr":System.out.println("Adult Gents");break;
		case "Mrs":System.out.println("Adult Ladies");break;
		case "Ms":System.out.println("Ladies");break;
		case "Dr":System.out.println("Doctor");break;
		case "Master":System.out.println("Kids Boys");break;

		default:System.out.println("Invalid");break;
		}
	}

}
