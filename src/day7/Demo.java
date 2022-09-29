package day7;

public class Demo {
	public static void main(String[]args) {
		String week="monday";
		switch(week){
		case"sunday":System.out.println("first day of the week");break;
		case"monday":System.out.println("second day of the week");break;
		case"tuesday":System.out.println("third day of the week");break;
		case"wednesday":System.out.println("fourth day of the week");break;
		case"thursday":System.out.println("fifth day of the week");break;
		case"friday":System.out.println("sixth day of the week");break;
		case"saturday":System.out.println("seventh day of the week");break;
		default:System.out.println("not available");break;
		}
	}

}
