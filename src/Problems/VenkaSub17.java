package Problems;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

record Employee(int num, String name, double salr) {
}

public class VenkaSub17 {
	private final static Employee[] arrayOfEmps = { new Employee(1, "Jeff Bezos", 100000.0),
			new Employee(2, "Bill Gates", 200000.0), new Employee(3, "Mark Zuckerberg", 300000.0) };

	private final static List<String> citys = new ArrayList<String>(Arrays.asList("Mumbai", "Pune", "Delhi"));

	final static List<BigDecimal> prices = Arrays.asList(new BigDecimal("10"), new BigDecimal("30"),
			new BigDecimal("17"), new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
			new BigDecimal("45"), new BigDecimal("12"));
	final static List<String> friends =
			Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
	
	public static void main(String[] args) {
		System.out.println("1 pune - " + citys.contains("pune"));
		System.out.println("2 Pune - " + citys.contains("Pune"));
		calculateDiscount();
		
		//CitiesTo upper case
		
		citys.stream().map(e->e.toUpperCase()).forEach(e->System.out.print(e+"\t"));
		System.out.println();
		friends.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.print(name + " "));
		System.out.println();
		friends.stream().map(name -> name.length()).forEach(name -> System.out.print(name + " "));
		
		// Reusing lambda expression
		final long countFriendsStartN =friends.stream().filter(name -> name.startsWith("N")).count();
		
		final Predicate<String> startsWithN = name -> name.startsWith("N");
		
		long nCount=friends.stream().filter(startsWithN).count();
		
		Function<String, Predicate<String>> startsWithLetter = (
				String letter) -> (String name) -> name.startsWith(letter);
        Function<String, Predicate<String>> startsWithLetterFunct =
						letter -> name -> name.startsWith(letter);
		
		long cnt=friends.stream().filter(startsWithLetterFunct.apply("N")).count();
		final long countFriendsStartB =friends.stream().filter(startsWithLetter.apply("B")).count();
		
		
		final Optional<String> foundName = friends.stream().filter(name -> name.startsWith("S")).findFirst();
		System.out.println(String.format("A name starting with %s: %s", "S", foundName.orElse("No name found")));
		
		System.out.println(friends.stream().mapToInt(e->e.length()).sum()+"  Count ");
		
		final Optional<String> aLongName = friends.stream()
				.reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		aLongName.ifPresent(name -> System.out.println(String.format("A longest name: %s", name)));
		
		final String steveOrLonger =
				friends.stream()
				.reduce("Steve", (name1, name2) ->
				name1.length() >= name2.length() ? name1 : name2);
		
		System.out.println(String.join( "-",friends));
		
		//System.out.println(friends.stream().map(String::toUpperCase).collect(String.join(", ")));
		
		
	}

	private static void calculateDiscount() {
		BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;
		for (BigDecimal price : prices) {
			if (price.compareTo(BigDecimal.valueOf(20)) > 0)
				totalOfDiscountedPrices = totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
		}
		System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
		// Lambda for above Code
		final BigDecimal totalOfDiscountedPrices2 = prices.stream()
				.filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
				.map(price -> price.multiply(BigDecimal.valueOf(0.9)))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		BigDecimal reduce = prices.stream().filter(e -> e.compareTo(BigDecimal.valueOf(10)) > 0)
				.map(p -> p.multiply(BigDecimal.valueOf(0.9)))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println("Total of discounted prices: " + totalOfDiscountedPrices2);
		System.out.println("Total of discounted prices: " + reduce);
	}

}
