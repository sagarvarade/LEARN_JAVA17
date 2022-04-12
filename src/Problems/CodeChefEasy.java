package Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CodeChefEasy {

	public static void main(String[] args) {
		//https://www.codechef.com/CCSTART2/problems/BUYPLSE/
		//BUYPLSE();
		
		//https://www.codechef.com/CCSTART2/submit/ISBOTH
		//ISBOTH();
		
		//https://www.codechef.com/CCSTART2/problems/DIFACTRS
		//DIFACTRS();
		
		//https://www.codechef.com/CCSTART2/problems/SECLAR
		//findSecondLargest();
		
		//https://www.codechef.com/CCSTART2/problems/RNGEODD
		//rangeOdd();
		//https://www.codechef.com/CCSTART2/submit/VALTRI
		//getBusForRaju();
		//https://www.codechef.com/CCSTART2/problems/REVMEE
		//printReversArray();
		
		//https://www.codechef.com/CCSTART2/problems/FINDMELI
		//findInArray();
		
		//https://www.codechef.com/CCSTART2/problems/TRIVALCH
		//validTRIVALCH();
		
		//https://www.codechef.com/CCSTART2/problems/REVSTRPT
		//reverseStarPrint();
		
		//https://www.codechef.com/CCSTART2/problems/ADDNATRL
		//addNaturalNumbers();
		//https://www.codechef.com/CCSTART2/problems/SUMEVOD
		//sumIsEveryware();
		
		//https://www.codechef.com/CCSTART2/problems/ANGTRICH
		//triangleWithAngle();
		
		//https://www.codechef.com/CCSTART2/problems/SQALPAT
		alternativeSquarePattern();
		
	}
	private static void alternativeSquarePattern() {
		try {
			Scanner sc=new Scanner(System.in);
			long range=sc.nextLong();
			
			if(range<1)
				return;
			
			long [] charachtersArry=new long[(int) (range*5)];
			
			for(int i=0;i<range*5;i++) {
				charachtersArry[i]=i;
			}
			System.out.println(Arrays.toString(charachtersArry));
			for(int i=1;i<=range;i++)
			{
				if(i/2==0)
				{
					
				}
				else {
					
				}
				
				System.out.println("#");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void triangleWithAngle() {
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str=br.readLine();
			String[] ary=str.split(" ");
			int a=Integer.valueOf(ary[0]);
			int b=Integer.valueOf(ary[1]);
			int c=Integer.valueOf(ary[2]);
			if((a+b+c)==180 && a!=0 && b!=0 && c!=0 ) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
	}

	private static void sumIsEveryware() {
		try {
			Scanner sc=new Scanner(System.in);
			long range=sc.nextLong();
			long oddsum=0;
			long evensum=0;
			long odd=1;
			long even=2;
			if(range<1)
				return;
			for(long i=0;i<range;i++)
			{
				oddsum+=odd;
				evensum+=even;
				odd+=2;
				even+=2;
			}
			System.out.println(oddsum+" "+evensum);
		}
		catch(Exception e)
		{
			return;
		}
	}

	private static void addNaturalNumbers() {
		try{
			Scanner sc=new Scanner(System.in);
    		//int count=sc.nextInt();
    		int count=3;
    		int sum=0;
    		for(int i=1;i<=count;i++)
    		{
    			sum=sum+i;
    		}
    		System.out.println(sum);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return;
		}
		
	}

	private static void reverseStarPrint() {
		try{
			Scanner sc=new Scanner(System.in);
    		//int count=sc.nextInt();
    		int count=5;
    		for(int j=0;j<count;j++)
    		{    
    			for(int q=j;q<=count;q++)
    			{
    				System.out.print(" ");
    			}
    			for(int k=0;k<=j;k++)
    			{
    				System.out.print("*");
    			}
    			System.out.println();
    		}
    		
		}
		catch(Exception e) {
			e.printStackTrace();
			return;
		}
	}

	private static void validTRIVALCH() {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		String str=br.readLine();
    		String[] ary=str.split(" ");
    		int a=Integer.valueOf(ary[0]);
    		int b=Integer.valueOf(ary[1]);
    		int c=Integer.valueOf(ary[2]);
    		if(a + b < c || a + c < b || b + c < a)
    		{
    			System.out.println("YES");
    		}
    		else
    			System.out.println("NO");
    		
		}
		catch(Exception e) {
			e.printStackTrace();
			return;
		}
	}

	private static void findInArray() {
		try{
			Scanner sc=new Scanner(System.in);
    		int count=sc.nextInt();
    		int varToFind=sc.nextInt();
    		int[] inArray=new int[count];
    		for(int i=0;i<count;i++)
    		{
    			inArray[i]=sc.nextInt();
    		}
    		boolean isThere=false;
    		for(int i=0;i<count;i++)
    		{
    			if(inArray[i]==varToFind)
    			{
    				isThere=true;
    				break;
    			}
    			else
    				isThere=false;
    		}
    		if(isThere)
    			System.out.println(1);
    		else
    			System.out.println(-1);
	    }
	    catch(Exception e)
	    {
	        return;
	    }
	}

	private static void printReversArray() {
		try{
			Scanner sc=new Scanner(System.in);
    		int count=sc.nextInt();
    		int[] inArray=new int[count];
    		for(int i=0;i<count;i++)
    		{
    			inArray[i]=sc.nextInt();
    		}
    		System.out.println(Arrays.toString(inArray));
    		for(int j=count-1;j>0;j--)
    		{
    			System.out.print(inArray[j]+" ");
    		}
	    }
	    catch(Exception e)
	    {
	        return;
	    }
		
	}



	private static void getBusForRaju() {
		try{
			Scanner sc=new Scanner(System.in);
    		int busno=sc.nextInt();
    		if((busno%5)==0 || (busno%6)==0)
			{
			System.out.println("YES");	
			}
    		else
    			System.out.println("NO");
	    }
	    catch(Exception e)
	    {
	        return;
	    }
	}



	private static void rangeOdd() {
		try{
    		Scanner sc=new Scanner(System.in);
    		int a=sc.nextInt();
    		int b=sc.nextInt();
    		for(int i=a;i<=b;i++)
    		{
    			if(i%2!=0)
    				System.out.print(i+" ");
    		}
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
	}



	private static void findSecondLargest() {
		 try{
	    		Scanner sc=new Scanner(System.in);
	    		int [] ar=new int[3];
	    		ar[0]=sc.nextInt();
	    		ar[1]=sc.nextInt();
	    		ar[2]=sc.nextInt();
	    		Arrays.sort(ar);
	    		System.out.println(ar[1]);
	    		
		    }
		    catch(Exception e)
		    {
		        e.printStackTrace();
		    }
	}
	private static void DIFACTRS() {
		try{
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		String str=br.readLine();
    		String[] ary=str.split(" ");
    		int val=Integer.valueOf(ary[0]);
    		List<Integer> divVal=new ArrayList<>();
    		for(int i=1;i<=val;i++) {
    			if(val%i==0)
    				divVal.add(i);
    		}
    		System.out.println(divVal.size());
    		for(Integer i:divVal)
    			System.out.print(i+" ");
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
	}



	private static void BUYPLSE() {
		try{
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		String str=br.readLine();
    		String[] ary=str.split(" ");
    		Integer sum=(Integer.valueOf(ary[0]) *Integer.valueOf(ary[2]))+(Integer.valueOf(ary[1]) *Integer.valueOf(ary[3])) ;
    		System.out.println(sum);
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
	}
	private static void ISBOTH() {
		try{
    		Scanner sc=new Scanner(System.in);
    		int num=sc.nextInt();
    		if((num%5)==0 && (num%11)==0)
    		{
    			System.out.println("BOTH");
    		}
    		if((num%5)==0 || (num%11)==0)
    		{
    			System.out.println("ONE");
    		}
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
		
	}
}
