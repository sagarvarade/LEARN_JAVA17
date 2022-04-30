package Problems;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class HundredJavaProgram {

	public static void main(String[] args) {
		//one_simpleJavaProgram();
		//two_printInt();
		//three_CommandLineArg(args);
		//four_PrintUserInput();
		//five_ConvertFarenheitToCelcius();
		//six_SwapNumbersUsingThirdVariable();
		//seven_SwapNumberWithoutThirdVariable();
		//eight_AddTwoNums();
		//nine_ShowLargestNum();
		//ten_IfElseClause();
		//eleven_IfElse();
		//twelve_nestedIfElse();
		//thirteen_oddEvenNumber();
		//fourteen_findFactorial();
		//fifteen_FactorialOfBigNumber();
		//Sixteen_CheckTwoString();
		//seventeen_ForLoop();
		//seventeen_ConsoleLoop();
		//Nineteen_WhileLoop();
		//Twenty_PrintReverseNumber();
		//TwentyOne_WhileUsingBreak();
		//twentyTwo_WhileUsingBreakAndContinue();
		//twentyThree_UsingForLoop();
		//twentyFour_UsingEnhanceForLoop();
		  twentyFive_MultiplicationTable();
		  
	}

	private static void twentyFive_MultiplicationTable() {
		int n, c;
		System.out.println("Enter an integer to print it's multiplication table");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		System.out.println("Multiplication table of " + n + " is :-");
		for (c = 1; c <= 10; c++) {
			System.out.println(n + "*" + c + " = " + (n * c));
		}
	}

	private static void twentyFour_UsingEnhanceForLoop() {
		List<String> str=Arrays.asList("a","b","c","d","e");
		for(String s:str)
			System.out.print(s+"\t");
	}

	private static void twentyThree_UsingForLoop() {
		char ch;
		for( ch = 'a' ; ch <= 'z' ; ch++ ) {
			System.out.println(ch);			
		}
	}

	private static void twentyTwo_WhileUsingBreakAndContinue() {
		int n;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Input an integer");
			n = input.nextInt();
			if (n != 0) {
				System.out.println("You entered " + n);
				continue;
			} else {
				break;
			}
		}
	}

	private static void TwentyOne_WhileUsingBreak() {
		int n=0;
		Scanner in=new Scanner(System.in);
		while(true)
		{
			System.out.println("Input an integer");
			n=in.nextInt();
			if(n==0)
				break;
			
			System.out.println("You have entered : "+n);
		}
		
	}

	private static void Twenty_PrintReverseNumber() {
		int n, reverse = 0;
		System.out.println("Enter the number to reverse");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
		}
		System.out.println("Reverse of entered number is " + reverse);
	}

	private static void Nineteen_WhileLoop() {
		int a=0;
		do{
			System.out.println("Print a > "+a);
			a++;
		}while(a<5);
		
		int j=1;
		while(j<5)
		{
			System.out.println("J is > "+j);
			j++;
		}
	}

	private static void seventeen_ConsoleLoop() {
		int row, numberOfStars;
		for (row = 1; row <= 10; row++) {
			for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void seventeen_ForLoop() {
		for (int c = 1; c <= 10; c++) {
			System.out.println("C  "+c);
		}
	}

	private static void Sixteen_CheckTwoString() {
		String s1, s2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string");
		s1 = in.nextLine();
		System.out.println("Enter the second string");
		s2 = in.nextLine();
		if ( s1.compareTo(s2) > 0 )
			System.out.println("First string is greater than second.");
		else if ( s1.compareTo(s2) < 0 )
			System.out.println("First string is smaller than second.");
		else
			System.out.println("Both strings are equal.");
		
	}

	private static void fifteen_FactorialOfBigNumber() {
		int n, c;
		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer");
		n = input.nextInt();
		for (c = 1; c <= n; c++) {
			fact = fact.multiply(inc);
			inc = inc.add(BigInteger.ONE);
		}
		System.out.println(n + "! = " + fact);
		
	}

	private static void fourteen_findFactorial() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value");
		int i=sc.nextInt();
		System.out.println("i  "+i);
		int fact=1;
		if(i<0)
			fact=1;
		else {
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
		}
		System.out.println("Fact is "+fact);
	}

	private static void thirteen_oddEvenNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value");
		Integer i=sc.nextInt();
		Predicate<Integer> even=(a)->a%2==0;
		Predicate<Integer> odd=(a)->a%2!=0;
		System.out.println("Check even :"+even.test(i));
		System.out.println("Check odd  :"+odd.test(i));
		
		
	}

	private static void twelve_nestedIfElse() {
		int marksObtained, passingMarks;
		char grade;
		passingMarks = 40;
		Scanner input = new Scanner(System.in);
		System.out.println("Input marks scored by you");
		marksObtained = input.nextInt();
		if (marksObtained >= passingMarks) {
			if (marksObtained > 90)
				grade = 'A';
			else if (marksObtained > 75)
				grade = 'B';
			else if (marksObtained > 60)
				grade = 'C';
			else
				grade = 'D';
			System.out.println("You passed the exam and your grade is " + grade);
		} else {
			grade = 'F';
			System.out.println("You failed and your grade is " + grade);
		}
	}

	private static void eleven_IfElse() {
		int marksObtained, passingMarks;
		passingMarks = 40;
		Scanner input = new Scanner(System.in);
		System.out.println("Input marks scored by you");
		marksObtained = input.nextInt();
		if (marksObtained >= passingMarks) {
		System.out.println("You passed the exam.");
		}
		else {
		System.out.println("Unfortunately you failed to pass the exam.");
		}
		
	}

	private static void ten_IfElseClause() {
		int a=9; int b=9;
		if(a<b)
			System.out.println("A is less than B");
		else if(a>b)
			System.out.println("A is greater than B");
		else
			System.out.println("A and b are same");
	}

	private static void nine_ShowLargestNum() {
		int [] numAry=new int [5];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<numAry.length;i++)
		{
			numAry[i]=in.nextInt();
		}
		Arrays.sort(numAry);
		System.out.println("Ary "+Arrays.toString(numAry)+" ,Largest "+numAry[numAry.length-1]);
	}

	private static void eight_AddTwoNums() {
		int a,b;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter two numbers ");
		a=in.nextInt();b=in.nextInt();
		System.out.println("Sum A  :"+a+" , B= "+b+" ,Sum is "+(a+b));
		BigInteger Ba=BigInteger.valueOf(a);
		BigInteger Bb=BigInteger.valueOf(b);
		BigInteger sum=Ba.add(Bb);
		System.out.println("Sum Ba  :"+Ba+" , Bb= "+Bb+" ,Sum is "+sum);
	}

	private static void seven_SwapNumberWithoutThirdVariable() {
		int a,b;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter two numbers ");
		a=in.nextInt();b=in.nextInt();
		System.out.println("Before Swap, A  :"+a+" , B= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap, A  :"+a+" , B= "+b);
	}

	private static void six_SwapNumbersUsingThirdVariable() {
		int a,b,c;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter two numbers ");
		a=in.nextInt();b=in.nextInt();
		System.out.println("Before Swap, A  :"+a+" , B= "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swap, A  :"+a+" , B= "+b);
	}

	private static void five_ConvertFarenheitToCelcius() {
		float temparature;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Temperature in Farenheit :");
		temparature=in.nextFloat();
		temparature=((temparature-32)*5)/9;
		System.out.println("Temperature in Celcius :"+temparature);
	}

	private static void four_PrintUserInput() {
		int a;
		float b;
		String s;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		s = in.nextLine();
		System.out.println("You entered string "+s);
		System.out.println("Enter an integer");
		a = in.nextInt();
		System.out.println("You entered integer "+a);
		System.out.println("Enter a float");
		b = in.nextFloat();
		System.out.println("You entered float "+b);
		
	}

	private static void three_CommandLineArg(String[] args) {
		for(String sr:args)
			System.out.println(sr);
	}

	private static void two_printInt() {
		for(int i=0;i<10;i++)
		{
			System.out.println("Int >> "+i);
		}
	}

	private static void one_simpleJavaProgram() {
		System.out.println("Hello World Java!");
	}

}
