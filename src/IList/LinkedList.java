package IList;

public class LinkedList<T> implements List<T> {

    private int CURRENT_SIZE = 0;
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    /**
     * Set/re-size the array
     *
     * @param size
     * @return
     */
    public boolean setSize(int size) {
        int prevSize = size();
        CURRENT_SIZE = size;
        Object[] tmpArray = new Object[CURRENT_SIZE];

        for (int i = 0; i < prevSize; i++)
            tmpArray[i] = oArray[i];

        // resize
        oArray = new Object[CURRENT_SIZE];

        for (int i = 0; i < prevSize; i++)
            oArray[i] = tmpArray[i];

        return true;
    }

    /**
     * Adds Object to the end of the LinkedList
     *
     * @param o
     * @return true if object was added;
     * false if there is no LinkList to add to
     */
    public boolean add(T item) {
        int size = size();
        Node<T> newNode = new Node<T>();
        newNode.item = item;
        newNode.next = null;

        if (size == 0 || head == null) {
            addFirst(newNode);
        } else {
            Node<T> tmpNode = head;
            // traverse through linked list to set next node
            while (tmpNode.next != null)
                tmpNode = tmpNode.next;

            tmpNode.next = newNode;
        }

        CURRENT_SIZE++;
        return true;
    }

    public void addFirst(Node<T> newNode) {
        head = newNode;
        head.next = null;
    }

    public void addLast(Node<T> newNode) {
//        tail = newNode;
//        tail.next = head;
    }

    /**
     * Removed the last object in LinkedList
     *
     * @param o
     * @return true if successful
     */
    public boolean remove(T item) {
        if (head == null || size() == 0 || !contains(item)) {
            return false;
        } else {
            Node<T> currentNode = head;
            Node<T> pastNode = null;

            while (currentNode != null && currentNode.item != item) {
                pastNode = currentNode;
                currentNode = currentNode.next;
            }
            pastNode.next = currentNode.next;

            CURRENT_SIZE--;
            return true;
        }
    }

    /**
     * Gets object from specified index
     *
     * @param index
     * @return can return null if doesn't exist
     */
    public T get(int index) {
        if (index > size())
            return null; // doesn't exists
        else if (index == 0) {
            return head.item;
        } else {
            Node<T> tmpNode = head.next;
            int counter = 1;

            while (tmpNode.next != null) {
                if (counter == index) {
                    return tmpNode.item;
                } else {
                    tmpNode = tmpNode.next;
                }
            }

            return null; // there is no item at specified index
        }
    }

    /**
     * Removes ojbect at specified index
     *
     * @param index
     * @return true if successful
     */
    public boolean removeAtIndex(int index) {
        int currentSize = size();
        if (oArray[index] != null) {
            Object[] tmp = oArray;
            for (int i = index; i < currentSize; i++) {
                oArray[i] = tmp[i + 1];
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Resets head node.
     *
     * @return new object list
     */
    public boolean clear() {
        head = null;
        return true;
    }

    /**
     * Get current size of LinkedList
     *
     * @return int: size
     */
    public int size() {
        return CURRENT_SIZE;
    }

    /**
     * Checks for the first existence of object in LinkedList
     *
     * @param o
     * @return
     */
    public boolean contains(T item) {
        if (head == null)
            return false; // items definitely doesn't exist

        Node<T> tmpNode = head;

        while (tmpNode != null) {
            if (tmpNode.item == item)
                return true;
            else
                tmpNode = tmpNode.next;
        }

        return false;
    }

    /**
     * Add Object at specified index into LinkedList
     *
     * @param index
     * @param o
     * @return
     */
    public boolean insertAt(int index, T item) {
        if (index == 0) {
            head.item = item;
            return true;
        } else {
            Node<T> tmpNode = head.next;
            int counter = 1;

            while (tmpNode.next != null) {
                if (counter == index) {
                    tmpNode.item = item;
                    return true;
                } else {
                    tmpNode = tmpNode.next;
                }
            }

            return false;
        }
    }

    /**
     * Checks if there are any objects in the linkedlist
     *
     * @return true if there are no objects in linkedlist
     */
    public boolean isEmpty() {
        if (head == null || size() == 0)
            return true;
        else
            return false;
    }
}
