package ch08;

public class Point<T, V> {
	
	T x;
	V y;
	
	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	// 한 점에 대한 코드 
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
	
}
