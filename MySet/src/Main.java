import java.util.Objects;

public class Main {
	
	int[] myRandoms;

	public void generateArray(int size, int max) {
		
		myRandoms = new int[size];	

		for(int i=0; i<myRandoms.length; i++) {
			myRandoms[i] = (int) (Math.random() * max);

		}
	}
	
	public void printRandoms() {
		for(int i : myRandoms) {
			System.out.println(i);
		}
	}
	
	public Main() {
		
		long start;
		long stop;
		long time;
		int elementNum;
		
		
		/*
		 * 1000 items
		 */
		
		MyHashSet<Integer> test;
		
		elementNum = 1000;
		test = new MyHashSet<Integer>(elementNum);
		generateArray(elementNum, Integer.MAX_VALUE);
		//generateArray(elementNum, 10);
		
		start = System.nanoTime();
		
		for(int i=0; i<elementNum; i++) {
			test.add(myRandoms[i]);
		}
		
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Time (ns): " +time);
		test.printElementNum();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

		/*
		 * 10000 items
		 */
		
		elementNum = 10000;
		test = new MyHashSet<Integer>(elementNum);
		generateArray(elementNum, Integer.MAX_VALUE);
		//generateArray(elementNum, 10);
		
		start = System.nanoTime();
		
		for(int i=0; i<elementNum; i++) {
			test.add(myRandoms[i]);
		}
		
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Time (ns): " +time);
		test.printElementNum();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		
		/*
		 * 100000 items
		 */
		
		elementNum = 100000;
		test = new MyHashSet<Integer>(elementNum);
		generateArray(elementNum, Integer.MAX_VALUE);
		//generateArray(elementNum, 10);
		
		start = System.nanoTime();
		
		for(int i=0; i<elementNum; i++) {
			test.add(myRandoms[i]);
		}
		
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Time (ns): " +time);
		test.printElementNum();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		//test.printElementNum();
		//test.printArray();
		//printRandoms();
		
		
		
		
		
//		MySet<Integer> test = new MySet<Integer>();
//		
//		/*
//		 * 1000 items test
//		 */
//		
//		test = new MySet<Integer>();
//		
//		elementNum = 1000;
//		generateArray(elementNum, Integer.MAX_VALUE);
//		start = System.nanoTime();
//		
//		for(int i=0; i<elementNum; i++) {
//			test.add(myRandoms[i]);
//		}
//		
//		stop = System.nanoTime();
//		time = stop - start;
//		System.out.println("Time (ns): " +time);
//		test.printSize();
//		
//		System.out.println("----------");
//		
//		
//		/*
//		 * 10000 items test
//		 */
//		test = new MySet<Integer>();
//		
//		elementNum = 10000;
//		generateArray(elementNum, Integer.MAX_VALUE);
//		start = System.nanoTime();
//		
//		for(int i=0; i<elementNum; i++) {
//			test.add(myRandoms[i]);
//		}
//		
//		stop = System.nanoTime();
//		time = stop - start;
//		System.out.println("Time (ns): " +time);
//		test.printSize();
//		
//		System.out.println("----------");
//		
//		
//		/*
//		 * 100000 items test
//		 */
//		test = new MySet<Integer>();
//		
//		elementNum = 100000;
//		generateArray(elementNum, Integer.MAX_VALUE);
//		start = System.nanoTime();
//		
//		for(int i=0; i<elementNum; i++) {
//			test.add(myRandoms[i]);
//		}
//		
//		stop = System.nanoTime();
//		time = stop - start;
//		System.out.println("Time (ns): " +time);
//		test.printSize();
//		
//		System.out.println("----------");
		
	}
	

	public static void main(String[] args) {
		new Main();
	}

}
