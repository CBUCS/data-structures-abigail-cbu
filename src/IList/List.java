package IList;

public interface List {

    static final int MIN_SIZE = 1;
    static final int CURRENT_SIZE = MIN_SIZE;

    Object[] oArray = new Object[MIN_SIZE];

    boolean setSize(int size);

    boolean add(Object o);

    boolean addAtIndex(int index, Object o);

    boolean addRange(Object[] oRange);

    boolean remove(Object o);

    boolean removeAtIndex(int index);

    Object[] removeAll();

    int getSize();

    boolean contains(Object o);

    Object[] toArray();

    boolean swap(int index1, int index2);

    int indexOf(Object o);

    boolean isEmpty();

    Object[] doubleLength(Object[] oPrevArray);

}
