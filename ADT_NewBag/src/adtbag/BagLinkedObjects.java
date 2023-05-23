package adtbag;

public class BagLinkedObjects<T> implements BagInterface<T>{

    private int numberOfItems;




    @Override
    public int getCurrentSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean add(T item) {
        return false;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public boolean remove(T item) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getFrequencyOf(T item) {
        return 0;
    }

    @Override
    public boolean contains(T item) {
        return false;
    }

    @Override
    public T[] toArray() {
        return null;
    }
}
