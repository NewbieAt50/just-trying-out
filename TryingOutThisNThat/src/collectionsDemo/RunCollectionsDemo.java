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
		
		GenericPair<String> stringPair = new GenericPair<String>("Hello", "World");
		genericPairList.add(stringPair);
		GenericPair<Integer> integerPair = new GenericPair<Integer>(42, 222);
		genericPairList.add(integerPair);
		
		System.out.println(genericPairList.size());
		
		Iterator<GenericPair> iterator = genericPairList.iterator();
		while(iterator.hasNext()) {
			GenericPair element = iterator.next();
			System.out.println(element);
			}
	}

}
