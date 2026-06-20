import java.util.Scanner;
public class IT26100769Lab9Q2 {
   public static void main (String[]args){
   
   Scanner sc = new Scanner (System.in);
   
   //read the radius from user inputs 
   System.out.print("Enther the Radius of the circle: ");
   double radius=sc.nextDouble();
   
   // call the method to display results method 
   double area = circleArea(radius);
   System.out.print("The area of the circle with radius" +radius +"is :"+area);
  }
  
  
  // make a new method 
  public static double circleArea(double radius){
	  return Math.PI *radius*radius;
  }
 
}