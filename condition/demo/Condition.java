

//     if/else   program

//
//package condition.demo;
//
//public class Condition {
//
//	public static void main(String[] args) {
//		
//		int age = 10;
//		if (age>18) {
//			System.out.println("yes you can vote");
//		} else {
//			System.out.println("sorry you can not vote try next year");
//		}
//		
//		
//	}
//
//}





package condition.demo;

public class Condition {

	public static void main(String[] args) {
		
		int number = 23;
		if (number<=10) {
			System.out.println("number is less then 10");
		} else if(number >10 && number <=20){
			
			System.out.println("number is greater then 10 and less then 20");
			
		}else if (number >20 && number <=30) {
			System.out.println("number is greater then 20 and less then 30");
		}
		
		else {
			System.out.println("number is graeter then 30");
		}
		
		
	}

}
