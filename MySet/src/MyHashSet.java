import java.util.ArrayList;

public class MyHashSet<E> {

	ArrayList<E>[] data; 	
	private int arraySize;	// size of array, 1.3 x number of items
	private int elementNum;	//number of stored elements

	private double multiplier = 2;
	
	public MyHashSet(int expectedItemNum) {
		
		elementNum = 0;
		arraySize = (int)(expectedItemNum * multiplier);
		System.out.println("Array size is: "+arraySize);
		
		// create an array of arraylists
		data = new ArrayList[arraySize]; 	
        for (int i = 0; i < arraySize; i++) { 
            data[i] = new ArrayList<E>(); 
        } 

	}


	public void printElementNum() {
		System.out.println("No of elements: "+elementNum);
	}

	public void add(E item) {
		
		int hashcode = item.hashCode();
		int index = hashcode % arraySize;	// mod it to make it fit inside array
		
		if( data[index].contains(item) ) {
			System.out.println("Cannot add: duplicate item!");
		}
		
		else {
			data[index].add(item);
			elementNum++;
		}
		
		
		
		
//		if(data[xIndex][0] != null && data[xIndex][0].equals(item)) {
//			System.out.println("Cannot add: duplicate item!");
//			return;
//		}
//
//		while(data[xIndex][yIndex] != null) {
//			//System.out.println("Increment y index: " +yIndex);
//			yIndex++;
//		}
//		
//		data[xIndex][yIndex] = item;
//		itemNum++;
	}

	
//	public boolean findElement(int index, E element) {
//		
//		if( data[index] != null && data[index].equals(element) ) {
//			return true;
//		}
//		
//		else if ( data[index] != null && !data[index].equals(element) ) {
//			
//		}
//		
//		return false;
//	}

	
	public void printArray() {
		System.out.println("~~~~~~~~~~~~~~");
		for(int i=0; i<data.length; i++) {
			System.out.println("i: "+i);
			for(int j=0; j<data[i].size(); j++) {
				System.out.println("j: " + j);
				System.out.println("value: " + data[i].get(j));
			}
			System.out.println("-----------");
		}
		System.out.println();
	}

}

