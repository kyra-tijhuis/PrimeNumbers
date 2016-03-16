package prime;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class PrimeSequence {
	
	public List<Integer> primes = new ArrayList<>();

	public List<Integer> primeFinder(int size) {
		primes.add(2);
		int n = 2;
		while (primes.size()<size) {
			boolean prime = true;
			for (int i : primes) {
				if (prime && n%i==0) {
					prime = false;
				}
			}
			if (prime) {
				primes.add(n);
			}
			n++;
		}
		return primes;
	}

	public static void main(String[] args) {
		PrimeSequence obj = new PrimeSequence();
		if (args.length==1) {
			try {
				List<Integer> primes = obj.primeFinder(Integer.parseInt(args[0]));
				ListIterator<Integer> iterator = primes.listIterator();
				while (iterator.hasNext()) {
					System.out.print(iterator.next() + " ");
				}
				System.out.println("");
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number");
			}
		}
	}
}