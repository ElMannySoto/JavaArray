// javac -d . JavaArrayClass.java 
package soto.manny.may.thirty;

import java.util.Scanner;

public class JavaArrayClass{
	
	public void CreateArray(int intElementsInArray){
	   
	   int intMyJavaArray[] = new int[intElementsInArray];
	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.println("--------------------------------------------");
	
	   for(int i=0;i<intElementsInArray;i++){
	      
		  System.out.print("Enter value for intMyJavaArray[" + i + "]: ");
		  intMyJavaArray[i] = scanner.nextInt();

	   }
	   
	   System.out.println("--------------------------------------------");
	   
	   for(int i=0;i<intElementsInArray;i++){
		   System.out.println("intMyJavaArray[" + i + "] = " + intMyJavaArray[i]);
	   }

	   System.out.println("--------------------------------------------");
	   
	}
}