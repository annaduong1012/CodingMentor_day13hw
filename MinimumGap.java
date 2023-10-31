package day13_class;

public class MinimumGap {

	public static void main(String[] args) {
		int[] randomArr = { 7, 8, 1, 2, 3, 4, 1, 7, 8 };
		int minimumGap = findMinGap(randomArr);
		System.out.println(minimumGap);

	}

	public static int findMinGap(int[] arr) {
		int minGap = arr.length - 1;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				
				int currentGap = j - i;
				if (arr[i] == arr[j] && currentGap < minGap) {
					minGap = currentGap;
				}
			}
		}

		return minGap;
	}
	//time complexity = (On2) & space complexity = O(1)
} 
