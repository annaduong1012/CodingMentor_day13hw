package day13_class;

public class TheFeast {

	public static void main(String[] args) {
		int moneyAvailable = 6;
		int pricePerCandy = 2;
		int numOfWrapForOneCandy = 2;
		int numOfCandies = findtheFeast(moneyAvailable, pricePerCandy, numOfWrapForOneCandy);
		System.out.println("The total number of candies you can have is " + numOfCandies);
	}

	public static int findtheFeast(int n, int c, int m) {
		int initialCandyAmount = n / c;
		int availableCandyWraps = initialCandyAmount;
		int totalFeast = initialCandyAmount;

		while (availableCandyWraps >= m) {
			int candiesConvertedFromWraps = availableCandyWraps / m;
			totalFeast += candiesConvertedFromWraps;
			availableCandyWraps = candiesConvertedFromWraps + (availableCandyWraps % m);
		}

		return totalFeast;
	}
	
	//time complexity = O(log_m(n/c)), space complexity = O(1)

}
