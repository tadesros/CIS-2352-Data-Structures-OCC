package stacks;

public interface StackInterface<T> {

    //All of the methods for the stack interface
    public void push(T item);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public void clear();

}
