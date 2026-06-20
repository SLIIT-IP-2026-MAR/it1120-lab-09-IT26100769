import java.util.Scanner;
public class IT26100769Lab9Q3{
	
	// add method
  public static int add(int a, int b){
      return a+b;
  }

    // multipy method 
	public static int multiply(int a,int b){
		return a*b;
	}
	
	//squar method 
	public static int squar(int a){
		return a*a;
	}
	
	public static void main(String[] args){
		
		// calculate (3*4+5*7)^2
	  int expression1=squar(add(multiply(3,4),multiply(5,7)));
	  System.out.println("Result od (3*4+5*7)^2\t;"+expression1);
	  
	  
	  //calculate (4+7)^2 + (8+3)^2
	  int expression2=add(squar(add(4,7)),squar(add(8,3)));
	  System.out.println("Result  of (4+7)^2 + (8+3)^2\t;"+expression2);
	}
	
	
}