package LinkedList;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		// list initialize
		LinkedList<String> list = new LinkedList<String>();
		
		// add the item to the rest of the 
		list.addLast("alif");
		list.addLast("tushar");
		list.addLast("sabbir");
		
		//add item begin of the list
		list.addFirst("sakib");
		list.addLast("tanvir");
		
		// list to array
		var items = list.toArray();
		System.out.println(Arrays.toString(items));
		
		// size of the list
		System.out.println(list.sizeOf());
		
		// remove item from last of the list
		list.removeLast();
		
		// checking item
		items = list.toArray();
		System.out.println(Arrays.toString(items));
		
		// remove item from begin of the list
		list.removeFirst();
		items = list.toArray();
		
		// checking
		System.out.println(Arrays.toString(items));
		System.out.println(list.sizeOf());
		
	}

}
