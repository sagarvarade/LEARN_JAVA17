package Problems;

import java.util.HashSet;
import java.util.Set;

public class DSAOne {

	public static void main(String[] args) {
		//BitManipulation();
		//XORDemo();
		//findNonDuplicateNumber();
		//System.out.println(factorialNumer(30));
		//trailingZerosInFactorial(30);
		//palindromeNumber(121);
		//palindromeString("aabbaac");
		/*  for(int i=2;i<100;i++) {
			  isPrimeNumber(i);
		  }*/
		
		System.out.println(gcd(60,24));
	}

	private static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b,a%b);
		
	}

	private static void isPrimeNumber(int num) {
		 int isPrime=0;
		 for(int i=2;i<(num/2);i++) {
			 if((num%i)==0) {
				 isPrime++;
			 }
		 }
		 if(isPrime>0)
		 {
			 //System.out.println("Not Prime "+num);
		 }
		 else
			 System.out.println("Is Prime "+num );
		
	}

	private static void palindromeString(String str) {
		String x="";
		for(int i=str.length()-1;i>=0;i--) {
			x=x+str.charAt(i);
		}
		System.out.println(x+"   "+str);
		System.out.println(x.equals(str)?"Palindrom":"Not Palindrome");
	}

	private static void palindromeNumber( int num) {
		int revers=0,rem,val;
		val=num;
		while(num!=0) {
			rem=num%10;
			revers=revers*10+rem;
			num=num/10;
		}
		System.out.println(revers==val?"Palindrome":"Not Palindrome");
		
	}

	private static void trailingZerosInFactorial(int num) {
		int res=0;
		for(int i=5;i<=num;i=i*5) {
			res=res+num/i;
		}
		System.out.println(res);
	}

	private static int factorialNumer(int i) {
		if(i<=1)
			return 1;
		else
			return i*factorialNumer(i-1);
		
	}

	private static void findNonDuplicateNumber() {
		int [] ary=new int[] {2,3,4,5,2,3};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<ary.length;i++) {
			int num=ary[i];
			if(set.contains(num)) {
				set.remove(num);
			}
			else 
				set.add(num);
		}
		System.out.println(set);
	}

	private static void XORDemo() {
		// Find non duplicate Number from array
		int [] ary=new int[] {2,3,4,2,3};
		int num=0;
		for(int i=0;i<ary.length;i++) {
			num=num^ary[i];
		}
		System.out.println(num);
	}

	private static void BitManipulation() {
		int a=5;
		int b=7;
		System.out.println((a|b)+" Or ");
		System.out.println((a&b)+" And ");
		System.out.println((a^b)+" ^ ");
		System.out.println((~a)+" ~ "+(~b));
		
		//Shift operator
		int q=2;
		int p=200;
		System.out.println("Multiply by  "+(q<<1)+" Shift  "+(q<<2)+"  "+(q<<3));
		System.out.println("Div by       "+(p>>1)+" Shift  "+(p>>2)+"  "+(p>>3));
	}

}

