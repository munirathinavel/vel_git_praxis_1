package Generics;

public class MultiPair<T, V> {
	private T value1;
	private V value2;

	public MultiPair(T value1, V value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public T getValue1() {
		return value1;
	}

	public void setValue1(T value1) {
		this.value1 = value1;
	}

	public V getValue2() {
		return value2;
	}

	public void setValue2(V value2) {
		this.value2 = value2;
	}

	@Override
	public boolean equals(Object obj) {

		MultiPair<T, V> other = (MultiPair<T, V>) obj;
		if (!value1.equals(other.value1) && !value2.equals(other.value2)) {
			return false;
		}

		return true;
	}

}
