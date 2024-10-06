package dac;

import java.util.Comparator;

public class CompareColor implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.getColor().compareTo(o2.getColor());
		
	}

}