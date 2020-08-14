//********************************************************************
// Garrett McCue 	
//
// 8/13/20
//
// CPSC-501-Lab6Ex2
//**********************************************************************
public class Ex2 {

	// ------------------------------------------------------------------
	// Find the time complexity of the following method.
	// ------------------------------------------------------------------

	int foo(int N) {
		int result = 0;
		for (int i = 0; i < N; i++)
			result++;
		for (int j = 0; j < 1000000; j++)
			result += j;
		return result;
	}
	
	/*
	 * The time complexity of this method is dependent upon N because 
	 * in the second for loop it executes a constant 1000000x. This 
	 * would mean that the time complexity would be O(N). This is because
	 *  as N grows towards infinity, when looking at asymptotic complexity, 
	 * 1000000 would be relatively small and therefore N would take importance. 
	 */

}
