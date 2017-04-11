package univ.lecture.riotapi;
public class ArrayList<T> implements Stack<T> {
	private static final int DEFAULT_MAX_STACK_SIZE = 5;
	private int maxSize;
	private int top;
	private T[] elements;

	@SuppressWarnings("unchecked")
	public ArrayList() {
		this.maxSize = DEFAULT_MAX_STACK_SIZE;
		this.top = -1;
		this.elements = (T[]) new Object[DEFAULT_MAX_STACK_SIZE];
	}

	@SuppressWarnings("unchecked")
	public ArrayList(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1;
		this.elements = (T[]) new Object[maxSize];
	}
	
	@Override
	public boolean push(T newElement) {
		if (this.top == this.maxSize - 1) {
			return false;
		} else {
			this.top++;
			this.elements[this.top] = newElement;
			return true;
		}
	}

	@Override
	public T pop() {
		if (this.isEmpty()) {
			return null;
		} else {
			return this.elements[this.top--];
		}
	}

	@Override
	public T peek() {
		if (this.isEmpty()) {
			return null;
		} else {
			return this.elements[this.top];
		}
	}

	@Override
	public boolean isEmpty() {
		return this.top == -1;
	}
}
