package DSA.PEP;

import org.junit.Test;

public class PepFunctions {
	
	@Test
	public void decimalToAnyBase() {
		int num=987;
		int base=2;
		int rv=0;
		int p=1;
		while(num>0) {
			int dig=num%base;
			num=num/base;
			rv+=dig*p;
			p=p*10;
		}
		System.out.print("\t"+rv+"\n");
		//1733
	}
	
	
	//@Test
	public void checkFreqInDigit() {
		int checkDigit=0;
		int x=100;
		int nod=0;
		int temp=x;
		while(temp!=0) {
			temp=temp/10;
			nod++;
		}
		int div=(int)Math.pow(10, nod-1);
		int count=0;
		while(div!=0) {
			int dgt=x/div;
			System.out.println(dgt);
			if(dgt==checkDigit)
			{
				count++;
			}
			x=x%div;
			div=div/10;
		}
		System.out.println(count);
	}
}
