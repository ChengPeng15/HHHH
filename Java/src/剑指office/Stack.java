package 剑指office;

public interface Stack<T> {
	public void clear();
	public boolean isEmpty();
	public T peek();
	public T pop();
	public void push(T elment);
	public int size();
}