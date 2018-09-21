package IList;

public class Set implements List {
    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public boolean setSize(int size) {
        return false;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean addAtIndex(int index, Object o) {
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
    public int getNumObjInList(Object[] o) {
        return 0;
    }

    @Override
    public int getNumObjects() {
        return 0;
    }

    @Override
    public boolean contains(Object o) {
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

    @Override
    public Object[] doubleLength(Object[] oPrevArray) {
        return new Object[0];
    }
}
