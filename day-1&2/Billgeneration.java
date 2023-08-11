import java.util.Scanner;

public class Billgeneration {

	public static void main(String[] args) {
		double pizza=100, popcorn=20, tea=10;
		Scanner sc = new Scanner(System.in);
		System.out.println( "enter the number of pizzas brought :"); 
		double np = sc.nextDouble();
		System.out.println( "enter the number of popcorn brought :");
		double nc = sc.nextDouble();
		System.out.print("enter the number of tea brought :");
		double nt = sc.nextDouble();
		double totalbill = pizza * np + popcorn * nc + tea * nt;
		double finalbill= (totalbill);
		System.out.println("your finalbill is : "+finalbill);
		System.out.println("enjoy the show");	
		
			sc.close();

	}

}
