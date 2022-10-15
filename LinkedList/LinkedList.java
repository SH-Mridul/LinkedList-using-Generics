package LinkedList;

public class LinkedList<T> {

	// structure of the list
	private class Node<T>
	{
	   private T value;
	   Node<T> next;
	   
	   public Node(T item) {
		 value = item;
	   }
	}
	
	// field
	private Node<T> first ;
	private Node<T> last;
	private int size;
	
	
	// addLast method
	public void addLast(T item)
	{   
		Node<T> node  =  new Node<T>(item);
		
		if(isEmpty())
		{
			first = last  =  node;
		}else
		{
			last.next = node;
			last = node;
		}
		
		size++;
	}	
	
	
	// addFirst method
	public void addFirst(T item)
	{
		Node<T> node  =  new Node<T>(item);
		
		if(isEmpty())
		{
			first = last  =  node;
		}
		else 
		{
			node.next = first;
			first = node;
		}
		
		size++;
	}
	
	
	// sizeOf method
	public int sizeOf()
	{
		return size;
	}
	
	// contains 
	public boolean contains(T item)
	{
		return indexOf(item) != -1;
	}
	
	
	// removeLast method
	public void removeLast()
	{
		if(isEmpty())
		{
			System.out.println("ups! list is empty!");
		}
		else
		{
		   if(first == last)
		   {
			   first = last = null;
			   size = 0;
		   }else {
			   last = getPrevious(last);
	           last.next = null;
	           size--;
		   }
		}
	}
	
	
	//removeFirst method
	public void removeFirst()
	{
		if(isEmpty())
		{
			System.out.println("ups! list is empty!");
		}
		else
		{
			if(first == last)
			{
				first = last =  null;
				size = 0;
			}else
			{
				first = first.next;
				size--;
			}
		}
	}
	
	
	// indexOf method
	public int indexOf(T item)
	{
		Node<T> current = first;
		int index = 0;
		while(current != null) {
			if(current.value == item)
			{
				return index;
			}
			index++;
			current = current.next;
		}
		
		return -1;
	}
	
	//getPrevious(private method for use in internal)
		private Node<T> getPrevious(Node<T> node)
		{
			Node<T> current = first;
			
			while(current != null)
			{
				if(current .next  == node)
					return current;
				current = current.next;
			}
			
			return null;
		}
		
		
	// isEmpty(private method for use in internal)
    private boolean isEmpty()
    {
    	if(first == null && last == null)
    	{
    		return true;
    	}
    	
    	return false;
    }
    
    
    // toArray
	public Object[] toArray()
	{
		Object items[] = new Object[size];
		Node<T> current = first;
		int index = 0;
		while(current != null)
		{
			items[index] = current.value;
			current = current.next;
			index++;
		}
		
		return items;
	}
}
