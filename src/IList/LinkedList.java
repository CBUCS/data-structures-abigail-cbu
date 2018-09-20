package IList;

public class LinkedList implements List {
    @Override
    public boolean setSize(int size) {
        return false;
    }

    @Override
    public boolean add(Object o) {
        int size = getSize();

        if (size == 0) {
            List.oArray[size] = o;
            doubleLength(List.oArray);
        }
        else
            List.oArray[size - 1] = o;
        
        return true;
    }


    @Override
    public boolean addRange(Object[] oRange) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        if (getSize() > 0) {
            if (contains(o)) {
                int i = indexOf(o);
                if (i < 0)
                    return false;
                else
                    removeAtIndex(i);
            }
        }
        return false;
    }

    @Override
    public boolean removeAtIndex(int index) {
        int currentSize = getSize();
        if (List.oArray[index] != null) {
            Object[] tmp = List.oArray;
            for (int i = index; i < currentSize - 2; i++) {
                List.oArray[i] = tmp[i + 1];
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object[] removeAll() {
        return new Object[getSize()];
    }

    @Override
    public int getSize() {
        int size = 0;
        if (List.oArray != null) {
            for (Object o : List.oArray
                    ) {
                if (o != null)
                    size++;

            }
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
        return List.oArray;
    }

    @Override
    public boolean addAtIndex(int index, Object o) {
        if (getSize() > index && index > 0) {
            List.oArray[index] = o;
            return true;
        }
        return false;
    }

    @Override
    public boolean swap(int index1, int index2) {
        if (List.oArray[index1] != null && List.oArray[index2] != null) {
            Object tmp = List.oArray[index1];
            List.oArray[index1] = List.oArray[index2];
            List.oArray[index2] = tmp;
            return true;
        }
        return false;
    }

    @Override
    public int indexOf(Object o) {
        int counter = 0;
        for (Object x : List.oArray) {
            if (o == x)
                return counter;
            counter++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        if (List.oArray == null || getSize() == 0)
            return true;
        else
            return false;
    }

    @Override
    public Object[] doubleLength(Object[] oPrevArray) {
        return new Object[0];
    }
}
