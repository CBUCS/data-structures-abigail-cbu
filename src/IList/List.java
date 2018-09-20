package IList;

public interface List {
    static final int STARTING_SIZE = 2;

    boolean setSize(int size);

    boolean add(Object o);

    boolean addAtIndex(int index, Object o);

    boolean addRange(Object[] oRange);

    boolean remove(Object o);

    boolean removeAtIndex(int index);

    Object[] removeAll();

    int getNumObjects();

    boolean contains(Object o);

    Object get(int index);

    boolean swap(int index1, int index2);

    int indexOf(Object o);

    boolean isEmpty();

    Object[] doubleLength(Object[] oPrevArray);

}
