package IList;

public class Set implements List {
    @Override
    public boolean add(Object o) {
        int size = getSize();

        List.oArray[size - 1] = o;
        return true;
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
    public Object[] removeAll() {
        int currentSize = getSize();
        return new Object[currentSize];
    }

    @Override
    public boolean setSize(int size) {
        return false;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Object o : List.oArray
                ) {
            size++;

        }
        return size;
    }

    @Override
    public boolean contains(Object o) {
        for (Object x : List.oArray) {
            if (o == x)
                return true;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean addAtIndex(int index, Object o) {
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
