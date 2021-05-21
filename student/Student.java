package student;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Input the age: ");
        int age=s.nextInt();
        System.out.println("Input the weight: ");
        int weight=s.nextInt();
        
        if((age>6&&age<15)&&weight>50)
        {
            if(age>6&&age<15)
            {
                try{
                    throw new NullPointerException("Age is outside the range");
                }
                catch(NullPointerException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            if(weight>50)
            {
                try{
                    throw new InvalidSpeedException("Weight is outside the range");
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
	}
	}
    
	  static class InvalidSpeedException extends Exception {


		public InvalidSpeedException(String message){
		     super(message);
		  }

		}
  


	}


