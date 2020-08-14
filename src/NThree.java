import java.util.Scanner;

//********************************************************************
// Garrett McCue 	
//
//8/11/20
//
//CPSC-501-Lab6Ex1
//**********************************************************************
public class NThree {
	// -------------------------------------------------------------
	// This is an example of the simplest Java method that would
	// have O(N3) time complexity, where N is the single input
	// parameter to the method.
	// -------------------------------------------------------------

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to be cubed: ");
		cube(scan.nextInt());

		scan.close();

	}

	public static void cube(int n) {
		int x = 0;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				for (int k = 0; k < n; k++) {
					x++;

				}
			}

		}
		System.out.println(x);

	}

}
