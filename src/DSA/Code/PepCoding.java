package DSA.Code;

import java.util.Scanner;

import org.junit.Test;


public class PepCoding {
	
	
	@Test
	public void reverseDigitInInt() {
		int digit=3742;
		int reverseDigit=0;
		while(digit!=0) {
			int num=digit%10;
			System.out.println(num);
			digit=digit/10;
			reverseDigit=reverseDigit*10+num;
		}
		System.out.println("\n "+reverseDigit);
	}
	
	//@Test
	public void reverseDigit() {
		int digit=3742;
		while(digit!=0) {
			int num=digit%10;
			System.out.println(num);
			digit=digit/10;
		}
	}
	
	
	
	//@Test
	public void printDigits() {
		int x=100;
		int nod=0;
		int temp=x;
		while(temp!=0) {
			temp=temp/10;
			nod++;
		}
		int div=(int)Math.pow(10, nod-1);
		while(div!=0) {
			int dgt=x/div;
			System.out.println(dgt);
			x=x%div;
			div=div/10;
		}
		
	}
	
	
	//@Test 
	public void printDigitCountInNumber() {
		int x=1839;
		int count=0;
		while(x!=0) {
			x=x/10;
			count+=1;
		}
		System.out.println(count+" ..");
	}
	
	//@Test
	public void fibonacci() {
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<10;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
	//@Test
	public void isPrimeInRange() {
		int start=6379;
		int end  =7576;
		for(int i=start;i<=end;i++) {
			int num=i;
			int divByCount=0;
			for(int j=2;j*j<i;j++)
			{
				if(num%j==0) {
					divByCount++;
					break;
				}
			}
			if(divByCount>0) {
				//System.out.println("Not prime "+i);
			}
			else
				System.out.println("Prime "+i);
		}
	}
	
	//@Test
	public void isPrimeNo() {
		for(int i=1;i<1000;i++) {
			int num=i;
			int divByCount=0;
			for(int j=2;j<num;j++)
			{
				if(num%j==0) {
					divByCount++;
				}
			}
			if(divByCount>0) {
				System.out.println("Not prime "+i);
			}
			else
				System.out.println("Prime "+i);
		}
	}
	//@Test
	public void isPrimeNo2() {
		for(int i=1;i<1000;i++) {
			int num=i;
			int divByCount=0;
			//for(int j=2;j<Math.sqrt(i);j++)
			for(int j=2;j*j<i;j++)
			{
				if(num%j==0) {
					divByCount++;
					break;
				}
			}
			if(divByCount>0) {
				//System.out.println("Not prime "+i);
			}
			else
				System.out.println("Prime "+i);
		}
	}
	//@Test
	public void isPrimeNo3() {
		for(int i=1;i<1000;i++) {
			int num=i;
			int divByCount=0;
			for(int j=2;j<Math.sqrt(i) && j/2==0 ;j++)
			{
				if(num%j==0) {
					divByCount++;
				}
			}
			if(divByCount>0) {
				System.out.println("Not prime "+i);
			}
			else
				System.out.println("Prime "+i);
		}
	}
	private static void scannerDemo() {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str2=sc.nextLine();
		int int1=sc.nextInt();
		long long1=sc.nextLong();
		
	}

	private static void loopDemo() {
		int i=1;
		while(i<5) {
			System.out.println(i++);
		}
		
		do {
			System.out.println(i--);
		}while(i>0);
		for(int j=0;j<5;i++) {
			
		}
	}
}
