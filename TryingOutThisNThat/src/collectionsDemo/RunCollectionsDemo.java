//fooling around with generics and collections
package collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import genericsDemo.*;

public class RunCollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<GenericPair> genericPairList = new ArrayList<GenericPair>();
		
		//creating and adding some genericPairs
		GenericPair<String> stringPair = new GenericPair<String>("Hello", "World");
		genericPairList.add(stringPair);
		GenericPair<Integer> integerPair = new GenericPair<Integer>(42, 222);
		genericPairList.add(integerPair);

		//adding integerPair, same-same but shorter ... 
		genericPairList.add(new GenericPair<Integer>(911, 112));

		
		System.out.println(genericPairList.size());
		
		//Iterating and printing with an iterator ... works!
		Iterator<GenericPair> iterator = genericPairList.iterator();
		while(iterator.hasNext()) {
			GenericPair element = iterator.next();
			System.out.println(element);
			}
		//Iterating and printing with a for-each and lambda ... works! 
		genericPairList.forEach((GenericPair) -> System.out.println(GenericPair));
	}

}
