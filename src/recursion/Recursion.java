package recursion;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		// System.out.println("Recursion");
		printNumbersFromStart(1);
		printNumberReverse(5);
		System.out.println(fact(5));
		System.out.println(sumOfDigits(5234 ));
		System.out.println(productOfDigits(5234));
		System.out.println(reverseDigits(5234));


	}
	
	static void printNumbersFromStart(int n) {
		if(n==5)return;

		System.out.println(n);
		printNumbersFromStart(n+1);
	}
	
	static void printNumberReverse(int n) {

		System.out.println(n);
		if(n==1)return;
		printNumberReverse(n-1);
	}
	
	static int fact(int n) {
		if(n==1) return 1;
		return n*fact(n-1);
	}
	
	static int sumOfDigits(int n) {
		if(n%10 == n) return n;
		return (n%10) + sumOfDigits(n/10);
	}
	static int productOfDigits(int n) {
		if(n%10 == n) return n;
		return (n%10) * productOfDigits(n/10);
	}
	
	static int reverseDigits(int n) {
		if(n%10 == n) return n;
		return (n%10) * productOfDigits(n/10);
	}
	
	

}
