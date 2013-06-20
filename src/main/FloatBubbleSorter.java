package main;

public class FloatBubbleSorter extends BubbleSorter{
	private float[] array = null;

	public int sort(float[] theArray){
		array = theArray;
		length = array.length;
		return doSort();
	}
	
	@Override
	protected void swap(int index) {
		float temp = array[index];
		array[index] = array[index+1];
		array[index+1] = temp;
	}

	@Override
	protected boolean outOfOrder(int index) {
		return (array[index] > array[index+1]);
	}

}
