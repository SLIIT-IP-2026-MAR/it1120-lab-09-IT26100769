import java.util.Scanner;
public class IT26100769Lab9Q4{
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		String[]names=new String[5];
		
		double[]aMark=new double[5];
		double[]eMark=new double[5];
		double[]finalMarks=new double[5];
		
		char[]grades=new char[5];
		
	    for (int i=0; i<5; i++){
			System.out.println();
		    System.out.print("Enter name of student "+(i+1)+":");
			names[i]=sc.nextLine();
			 
			System.out.print("Enter Assignment marks for "+names[i]+":");
			aMark[i]=sc.nextDouble();
			  
			System.out.print("Enter the Exam paper Mark for "+names[i]+":");
			eMark[i]=sc.nextDouble();
			sc.nextLine();
			   
			   //call the methods
			finalMarks[i] =calcFinalMark(aMark[i],eMark[i]);
			grades[i]=findGrades(finalMarks[i]);
			     
		}
		 System.out.println();
		 
		 System.out.println("Name\t\tFinal Marks\t\tGrade");
	
		for (int i=0; i<5; i++){
	    printDetails(names[i],finalMarks[i],grades[i]);
		}
	}
   //calculate the final mark 
   public static double calcFinalMark(double aMark, double eMark){
    return (aMark*0.3)+(eMark*0.7);
   }
   
   // find grades 
   public static char findGrades(double finalMarks){
	    
		if (finalMarks>=75){
			return 'A';
		}else if (finalMarks>=60){
			return 'B';
		}else if (finalMarks>=50){
			return'C';
		}else{
			return'F';
		}
   }
   
   //methed to print details 
   public static void printDetails(String names,double finalMarks, char grade){
	   System.out.println(names+"\t\t" +String.format("%.2f",finalMarks)+"\t\t\t" +grade);
   }
}