//********************************************************************
// Garrett McCue 	
//
// 8/13/20
//
// CPSC-501-Lab6Ex3
//**********************************************************************

public class Ex3 {
	// ------------------------------------------------------------------
	// Find the time complexity of the following method.
	// ------------------------------------------------------------------
	int bar(int N) {
		int result = 1;
		for (int i = 1; i < N; i *= 2)
			result += 2;
		return result;
	}
	
	/*
	 * The method only has one for loop based on the input parameter
	 * of N. This could be mistaken for O(N) complexity, but since this
	 * method doesnt increment through every single value so it has a time
	 * complexity of O(log(n). This is because i increments at a rate of 
	 * i*2 for every iteration instead of i+1. This allows for a drastically
	 * smaller number of operations as N grows. 
	 */

}
