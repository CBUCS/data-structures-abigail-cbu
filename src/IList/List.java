package IList;

public interface List {

    boolean add(Object o);

    boolean addAtIndex(int index);

    boolean addRange(Object[] oRange);

    boolean remove(Object o);

    boolean removeAtIndex(int index);

    boolean removeAll();

    int getSize();

    boolean contains(Object o);

    Object[] toArray();

    boolean replace(int index, Object o);

    boolean swap(int index1, int index2);

    int indexOf(Object o);

    boolean isEmpty();

}
