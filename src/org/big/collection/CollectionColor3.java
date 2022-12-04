package org.big.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionColor3 {

	public static void main(String[] args)
	{
		Set<String> set = new TreeSet<>();

		set.add("Pink");
		set.add("Blue");
		set.add("Green");
		set.add("Brown");
		set.add("Black");

		// 11
		System.out.println("set: " + set);
		System.out.println("\nend 11");

		// 12
		Set<String> newSet = new TreeSet<>();
		newSet.add("Yellow");
		newSet.add("Magenta");
		newSet.add("Grey");
		newSet.add("purpole");
		System.out.println("\nNew Set: " + newSet);
		newSet.addAll(set);
		System.out.println("\nafter adding all element to New set");
		System.out.println(newSet);
		System.out.println("\nend 12");
		// 13
		Iterator<String> iterator = ((TreeSet<String>) newSet).descendingIterator();
		System.out.println("\nElements in Reverse Order:");
		while (iterator.hasNext())
		{
			System.out.print(iterator.next() + " ");
		}
		System.out.println("\nend 13");

		// 14
		System.out.println("\nElements of New Set\n" + newSet);
		System.out.println("\nFirst Element of New Set is: " + ((TreeSet<String>) newSet).first());

		System.out.println("\nLast Element of New Set is: " + ((TreeSet<String>) newSet).last());
		System.out.println("\nend 14");
		// 15
		Set<Integer> set1 = new TreeSet<Integer>();

		set1.add(56);
		set1.add(54);
		set1.add(32);
		set1.add(88);
		set1.add(90);
		set1.add(3);
		set1.add(78);

		System.out.println("\n New Set1 Elements are:\n" + set1);
		System.out.println("\n Number greater than or equal 50 =" + ((TreeSet<Integer>) set1).ceiling(50));
		System.out.println("\n Number greater than or equal 90 =" + ((TreeSet<Integer>) set1).ceiling(90));
		System.out.println("\nend 15");
	}

}
