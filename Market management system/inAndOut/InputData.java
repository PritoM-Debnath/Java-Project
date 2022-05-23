package project.inAndOut;
import java.util.Scanner;
public class InputData {

	public int inputInt() {
		int i = 0;
		boolean input= false ;
		
		while(!input) {
			Scanner sc = new Scanner(System.in);
			try {
				i=sc.nextInt();
				input=true;
			}catch(Exception e) {
				System.out.print("Invalid input...\nEnter input : ");
				input=false ;
			}
		}
		return i ;
	}
	
	public double inputDouble() {
		double i = 0;
		boolean input= false ;
		while(!input) {
			Scanner sc = new Scanner(System.in);
			try {
				i=sc.nextDouble();
				input=true;
			}catch(Exception e) {
				System.out.print("Invalid input...\nEnter input : ");
				input=false ;
			}
		}
		return i ;
	}
	
	public String inputString() {
		String i = null;
		boolean input= false ;
		while(!input) {
			Scanner sc = new Scanner(System.in);
			try {
				i=sc.nextLine();
				input=true;
			}
			catch(Exception e) {
				System.out.print("Invalid input...\nEnter input : ");
				input=false ;
			}
		}
		return i ;
	}
}
