package stacks;

import java.util.EmptyStackException;


public class LinkedStack<T> implements StackInterface<T>
{
    class Node<T>
    {

        //Ok to use public since this is a private inner.
        public T item;
        public Node next;
        public Node(T item)
        {
            this(item, null);

        }
        public Node(T item, Node next)
        {

        }
    }

    private Node<T> top;

    //Give your attributes values
    public LinkedStack(){
        //Set a new stack
        top = null;

    }

    @Override
    public void push(T item) {
        //Node with T item and next node can be null or next node? of T
        //Push a node on and the next is the new node
        Node<T> node = new Node<T>(item, top);
        //If empty top is null or none
        //Empty top = null
        //Next = current top also
    }

    @Override
    public T pop() {
        checkForEmptyAndThrow();
        T item = top.item;
        //Reference to next if no reference then it no longer exists garbage collector.
        top = top.next;
        return null;
    }

    @Override
    public T peek() {
        checkForEmptyAndThrow();
        return null;
    }

    private void checkForEmptyAndThrow() {
        //Don't peek on empty
        if(isEmpty()){
            throw new EmptyStackException();
        }
    }

    @Override
    public boolean isEmpty() {

        //Return top = null
        return false;
    }

    @Override
    public void clear() {
        top = null;
    }
}
