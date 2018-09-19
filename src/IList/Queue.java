package IList;

public class Queue implements List {

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean addAtIndex(int index) {
        return false;
    }

    @Override
    public boolean addRange(Object[] oRange) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean removeAtIndex(int index) {
        return false;
    }

    @Override
    public boolean removeAll() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean replace(int index, Object o) {
        return false;
    }

    @Override
    public boolean swap(int index1, int index2) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
