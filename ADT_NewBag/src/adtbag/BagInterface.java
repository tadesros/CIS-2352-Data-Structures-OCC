package adtbag;

//Interface usually only define public methods
//Things a bag should do.
//Like a grocery bag
//Acts like a contract
public interface BagInterface<T> {

    //Generic - <String> can be of any type
    public int getCurrentSize();
    public boolean isEmpty();
    public boolean add(T item);
    public T remove();
    public boolean remove(T item);
    //Clear out bag
    public void clear();
    public int getFrequencyOf(T item);
    public boolean contains(T item);
    //Return an array of all items in array
    public T[] toArray();
}
