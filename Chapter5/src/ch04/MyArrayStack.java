package ch04;

import ch02.MyArray;

public class MyArrayStack {

	MyArray arrayStack;
	int top;
	
	public MyArrayStack() {
		top = 0;
		// default == 10
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack is full");
			return;
		}
		
		arrayStack.addElement(data);
		top++;
	}
	
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return MyArray.ERROR_NUM;
		}
		
		return arrayStack.removeElement(--top);
	}
	
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return MyArray.ERROR_NUM;
		}
		
		return arrayStack.getElement(--top);
	}
	
	public boolean isFull() {
		//stack full 여부 체크
		if (top == arrayStack.ARRAY_SIZE) {
			return true;	// is full
		}
		
		return false;		// not full
	}
	
	public boolean isEmpty() {
		if (top == 0) {
			System.out.println("Stack is empty");
			return true;
		}
		
		return false;
	}
	
	public void printAll() {
		arrayStack.printAll();
	}
	
}
