package Generics;

public class Pair<T> {
	private T value1;
	private T value2;

	public Pair(T value1, T value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	

	public T getValue1() {
		return value1;
	}

	public void setValue1(T value1) {
		this.value1 = value1;
	}

	public T getValue2() {
		return value2;
	}

	public void setValue2(T value2) {
		this.value2 = value2;
	}

	@Override
	public boolean equals(Object obj) {
		

		Pair<T> other = (Pair<T>) obj;
		
		if (!value1.equals(other.value1) && !value2.equals(other.value2)) {
			return false;
		}

		return true;
	}

}
