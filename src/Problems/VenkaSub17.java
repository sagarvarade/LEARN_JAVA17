package Problems;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record Employee(int num, String name, double salr) {
}

public class VenkaSub17 {
	private final static Employee[] arrayOfEmps = { new Employee(1, "Jeff Bezos", 100000.0),
			new Employee(2, "Bill Gates", 200000.0), new Employee(3, "Mark Zuckerberg", 300000.0) };

	private final static List<String> citys = new ArrayList<String>(Arrays.asList("Mumbai", "Pune", "Delhi"));

	final static List<BigDecimal> prices = Arrays.asList(new BigDecimal("10"), new BigDecimal("30"),
			new BigDecimal("17"), new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
			new BigDecimal("45"), new BigDecimal("12"));

	public static void main(String[] args) {
		System.out.println("1 pune - " + citys.contains("pune"));
		System.out.println("2 Pune - " + citys.contains("Pune"));

		calculateDiscount();

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
