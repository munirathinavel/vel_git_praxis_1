package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class PairDemo {

	public static void main(String[] args) {

		compareString();
		comapreInteger();

		ArrayList<String> list = new ArrayList<String>();
		list.add("12321");
		printCollection(list);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(2321);
		printCollection(list1);
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("qeqwe");
		printCollection(linkedList);

	}
	
	static void printCollection(Collection<?> c) {
		for (Object e : c) {
			System.out.println(e);
		}
	}

	private static void compareString() {
		Pair<String> pair = new Pair<String>("first", "second");

		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.next();

		Pair<String> pair2 = new Pair<String>(str1, str2);

		if (pair.equals(pair2)) {
			System.out.println("Input is correct!");
		} else {
			System.out.println("Wrong Input!");
		}
	}

	private static void comapreInteger() {
		Pair<Integer> pair1 = new Pair<Integer>(new Integer(1), new Integer(2));

		Pair<Integer> pair = new Pair<Integer>(1, 2);

		Scanner scanner = new Scanner(System.in);
		Integer str1 = scanner.nextInt();
		Integer str2 = scanner.nextInt();

		Pair<Integer> pair2 = new Pair<Integer>(str1, str2);

		if (pair.equals(pair2)) {
			System.out.println("Input is correct!");
		} else {
			System.out.println("Wrong Input!");
		}
	}
}
