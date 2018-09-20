package IList;

public class LinkedList implements List {

    private Object[] oArray;
    private int CURRENT_SIZE = 0;

    public LinkedList () {
        oArray = new Object[List.STARTING_SIZE];
    }

    @Override
    public boolean setSize(int size) {
        return false;
    }

    /**
     * Adds Object to the end of the LinkedList
     * @param o
     * @return true if object was added;
     * false if there is no LinkList to add to
     */
    @Override
    public boolean add(Object o) {
        int size = getNumObjects();

        if (size == 0) {
            oArray[size] = o;
            oArray = doubleLength(oArray);
        }
        else
            oArray[size - 1] = o;

        if(getNumObjects() > (CURRENT_SIZE/2))
            oArray = doubleLength(oArray);

        return true;
    }

    /**
     * Add an entire Object[] to the back of the LinkedList
     * @param oRange
     * @return true if successful
     */
    @Override
    public boolean addRange(Object[] oRange) {
        return false;
    }

    /**
     * Removed the last object in LinkedList
     * @param o
     * @return true if successful
     */
    @Override
    public boolean remove(Object o) {
        if (getNumObjects() > 0) {
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

    /**
     * Gets object from specified index
     * @param index
     * @return can return null if doesn't exist
     */
    @Override
    public Object get(int index) {
        return oArray[index];
    }

    /**
     * Removes ojbect at specified index
     * @param index
     * @return true if successful
     */
    @Override
    public boolean removeAtIndex(int index) {
        int currentSize = getNumObjects();
        if (oArray[index] != null) {
            Object[] tmp = oArray;
            for (int i = index; i < currentSize - 2; i++) {
                oArray[i] = tmp[i + 1];
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Removes all objects in LinkedList
     * @return new object list
     */
    @Override
    public Object[] removeAll() {
        return new Object[getNumObjects()];
    }

    /**
     * Get current size of LinkedList
     * @return int: size
     */
    @Override
    public int getNumObjects() {
        int size = 0;
        if (oArray != null) {
            for (Object o : oArray
                    ) {
                if (o != null)
                    size++;

            }
        }
        return size;
    }

    /**
     * Checks for the first existence of object in LinkedList
     * @param o
     * @return
     */
    @Override
    public boolean contains(Object o) {
        for (Object x : oArray) {
            if (o == x)
                return true;
        }
        return false;
    }

    @Override
    public boolean addAtIndex(int index, Object o) {
        if (getNumObjects() > index && index > 0) {
            oArray[index] = o;
            return true;
        }
        return false;
    }

    @Override
    public boolean swap(int index1, int index2) {
        if (oArray[index1] != null && oArray[index2] != null) {
            Object tmp = oArray[index1];
            oArray[index1] = oArray[index2];
            oArray[index2] = tmp;
            return true;
        }
        return false;
    }

    @Override
    public int indexOf(Object o) {
        int counter = 0;
        for (Object x : oArray) {
            if (o == x)
                return counter;
            counter++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        if (oArray == null || getNumObjects() == 0)
            return true;
        else
            return false;
    }

    @Override
    public Object[] doubleLength(Object[] oPrevArray) {
        int prevSize = getNumObjects();
        CURRENT_SIZE = prevSize * 2;
        Object[] newOArray = new Object[CURRENT_SIZE];

        for(int i = 0; i < prevSize; i++)
            newOArray[i] = oPrevArray[i];
        return newOArray;
    }
}
