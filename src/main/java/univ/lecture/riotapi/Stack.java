package univ.lecture.riotapi;
public interface Stack<T> {
	public boolean push(T anEntry);
	
	public T pop();
	
	public T peek();
	
	public boolean isEmpty();
	
}
