package ch03;

// 1/2을 해야하기 때문에 0번 인덱스는 사용하지 않음 (1 ~ N)
public class HeapSort {

	private int SIZE;
	private int heapArr[];
	
	public HeapSort() {
		SIZE = 0;
		heapArr = new int[50];
	}
	
	public void insertHeap(int input) {
		int i = ++SIZE;
//		while ( ( i != 1 ) && ( input > heapArr[i / 2] ) ) {	// max heap
		while ( ( i != 1 ) && ( input < heapArr[i / 2] ) ) {	// min heap
			heapArr[i] = heapArr[i / 2];	// parent 위치로 올리는 작업 
			i = i / 2;
		}
		heapArr[i] = input;
	}
	
	public int getHeapSize() {
		return SIZE;
	}
	
	public int deleteHeap() {
		// 뺄때는 최상위부터 뺌 
		int parent, child;
		int data, temp;
		data = heapArr[1];
		
		temp = heapArr[SIZE];
		SIZE -= 1;
		parent = 1;
		child = 2;
		
		while ( child <= SIZE ) {
//			if ( ( child < SIZE ) && ( heapArr[child] < heapArr[child + 1] ) ) {	// max heap
			if ( ( child < SIZE ) && ( heapArr[child] > heapArr[child + 1] ) ) {	// min heap
				child++;
			}
//			if ( temp >= heapArr[child] ) break;
			if ( temp <= heapArr[child] ) break;
			heapArr[parent] = heapArr[child];
			parent = child;
			child *= 2;
		}
		
		heapArr[parent] = temp;
		return data;
	}
	
	public void printHeap() {
		System.out.printf("\n Max Heap : ");
		
		for ( int i = 1 ; i <= SIZE ; i++ ) {
			System.out.printf("[%d] ", heapArr[i]);
		}
	}

	public static void main(String[] args) {

		HeapSort hs = new HeapSort();
		
		hs.insertHeap(80);
		hs.insertHeap(50);
		hs.insertHeap(70);
		hs.insertHeap(10);
		hs.insertHeap(60);
		hs.insertHeap(20);
		
		hs.printHeap();
		
		int n, data;
		n = hs.getHeapSize();
		
		for ( int i = 1 ; i <= n ; i++ ) {
			data = hs.deleteHeap();
			System.out.printf("\n 출력 : [%d]", data);
		}

	}

}
