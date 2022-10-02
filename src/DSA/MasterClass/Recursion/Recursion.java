package DSA.MasterClass.Recursion;

public class Recursion {
	public static void main(String[] args) {
		openDollRecursion(5);
		System.out.println("Fact of 5 :"+factorial(5));
	}

	private static int factorial(int i) {
		if(i==1)
			return 1;
		else 
			return i*factorial(i-1);
	}

	private static void openDollRecursion(int i) {
		if(i==0)
		{
			System.out.println("All Dolls open");
		}
		else {
			System.out.println("Opening "+i);
			openDollRecursion(i-1);
		}
		
	}
}
