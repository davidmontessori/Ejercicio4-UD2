package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Dame un radio");
	double radio=input.nextDouble();
	
	double area=Math.PI*radio*radio;
	
	System.out.println("el area es "+area);
	input.close();

	}

}
