import soto.manny.may.thirty.JavaArrayClass;
import java.util.Scanner;


public class MyMainClass{
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
        int intArraySize;
		
		System.out.println("---------------------------------");
		System.out.print("How many elements for array? ");
		intArraySize = scanner.nextInt();
		System.out.println("\tArray Elements: " + intArraySize);
	
		System.out.println("---------------------------------");
		
        JavaArrayClass jac = new JavaArrayClass();
		jac.CreateArray(intArraySize);
		
	}
	
}