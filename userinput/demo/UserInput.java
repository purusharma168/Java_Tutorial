
package userinput.demo;
import java.util.Scanner;



public class UserInput {

	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
        int principle =sc.nextInt();
        float rate = sc.nextFloat();
        int time = sc.nextInt();
        
      
        float simpleInterest = principle * rate * time /100;
       
        System.out.println("the simple interst is "+ simpleInterest);
        
       // int x = sc.nextInt();
      //  String hey = sc.nextLine();
        // we can give double float value as well
        //System.out.println(x);
     //   System.out.println(hey);
        
        
        
        
        
        
        
        
        
	}

}
