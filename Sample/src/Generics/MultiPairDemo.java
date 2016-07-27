package Generics;

import java.util.Scanner;

public class MultiPairDemo {

	public static void main(String[] args) {

		compareString();
		comapreInteger();

	}

	private static void compareString() {
		MultiPair<String, String> pair = new MultiPair<String, String>("first", "second");

		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.next();

		MultiPair<String, String> pair2 = new MultiPair<String, String>(str1, str2);

		if (pair.equals(pair2)) {
			System.out.println("Input is correct!");
		} else {
			System.out.println("Wrong Input!");
		}
	}

	private static void comapreInteger() {
		MultiPair<Integer, Integer> pair = new MultiPair<Integer, Integer>(new Integer(1), new Integer(2));

		Scanner scanner = new Scanner(System.in);
		Integer str1 = scanner.nextInt();
		Integer str2 = scanner.nextInt();

		MultiPair<Integer, Integer> pair2 = new MultiPair<Integer, Integer>(str1, str2);

		if (pair.equals(pair2)) {
			System.out.println("Input is correct!");
		} else {
			System.out.println("Wrong Input!");
		}
	}
}
