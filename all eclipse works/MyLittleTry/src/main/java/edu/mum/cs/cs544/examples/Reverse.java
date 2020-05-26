package edu.mum.cs.cs544.examples;

public class Reverse {

	public static void main(String[] args) {
		int[] A = {3, 5, 7};
		reverseArray(A, 0, 2);
		
		for(int i = 0; i <= 2; i++)
		System.out.println(A[i]);
		
		int[] B = {34, 56, 17};
		iterativeReverse(B, 0, 2);
		
		for(int i = 0; i <= 2; i++)
			System.out.println(B[i]);
	}
	
	static void reverseArray(int[] A, int i, int j) {
		if(i < j) {
			
			// this is the code for swapping
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			
			reverseArray(A, i + 1,  j - 1);
		}
		
		return;
	
}

static void iterativeReverse(int[] B, int i, int j) {
	while(i < j) {
		int temp = B[i];
		B[i] = B[j];
		B[j] = temp;
		i++;
		j--;
	}
	
	return;
}

}