
public class MySet<E> {

	private E[] data;
	private int arraySize;
	private int itemNum;

	public MySet() {
		arraySize = 10;
		data = (E[])(new Object[arraySize]);	
		itemNum = 0;
	}
	
	public void printSize() {
		System.out.println("Number of items: "+itemNum);
	}


	
	public void add(E item) {
		
		if(findElement(item) >= 0) {
			System.out.println("Cannot add: duplicate item!");
			return;
		}
		
		if(itemNum == data.length) {
			//System.out.println("Array full: doubling size!!");
			increaseSize();
		}
		
		data[itemNum++] = item;
	}

	public int findElement(E element) {
		for(int i=0; i<data.length; i++) {
			if(element.equals(data[i])) {
				//System.out.println("Item found!!");
				return i;
			}
		}
		//System.out.println("Item not found!!");
		return -1;
	}

	public void remove(E element) {

		int findIndex = findElement(element);

		if( findIndex < 0 ) {
			return;
		}
		
		else {
			data[findIndex] = null;
			
			for(int i=findIndex; i<itemNum; i++) {
				data[i] = data[i+1];
			}
			
			data[itemNum] = null;
			itemNum--;
		}
	}
	
	/**
	 * Increase the size of the internal array
	 */
	private void increaseSize() {

		// double size
		E[] temp = (E[])new Object[data.length*2]; 

		// copy the data
		for(int i=0; i<data.length; i++) {
			temp[i] = data[i];
		}

		// rename it to data
		data = temp;
	}
	
	/**
	 * Print out all elements
	 */
	public void printArray() {
		for(int i=0; i<data.length; i++) {
			System.out.println(i + " " + data[i]);
		}
		System.out.println();
	}

}

