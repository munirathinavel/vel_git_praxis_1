package Generics;

import java.util.ArrayList;
import java.util.List;

public class Java5 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(234);
		list.add(3434);

		for (Integer integer : list) {
			System.out.println(integer);

		}
	}

}
