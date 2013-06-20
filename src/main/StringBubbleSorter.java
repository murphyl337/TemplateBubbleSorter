package main;

public class StringBubbleSorter extends BubbleSorter{
	private char[] array = null;

	public int sort(char[] theArray){
		array = theArray;
		length = array.length;
		return doSort();
	}
	
	@Override
	protected void swap(int index) {
		char temp = array[index];
		array[index] = array[index+1];
		array[index+1] = temp;
	}

	@Override
	protected boolean outOfOrder(int index) {
		return (array[index] > array[index+1]);
	}
}
