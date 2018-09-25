package IList;

public class LinkedList<T> implements List<T> {

    private int CURRENT_SIZE = 0;
    private Node<T> head;

    public LinkedList() {
        this.head = null;
        this.CURRENT_SIZE = 0;
    }

    /**
     * Adds Object to the end of the LinkedList
     *
     * @param item
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
     * Removed first occurrence of item in linked list
     *
     * @param item
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
            pastNode.next = currentNode.next; // remove item from list by pointing to next item

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

            while (tmpNode.next != null && counter != index) {
                tmpNode = tmpNode.next;
            }

            return tmpNode.item; // there is no item at specified index
        }
    }

    /**
     * Removes ojbect at specified index
     *
     * @param index
     * @return true if successful
     */
    public boolean removeAtIndex(int index) {
        if (size() < index || head == null)
            return false; // can't remove at an index that doesn't exist
        else if (index == 0) {
            head = head.next; // would work if next is null?
            return true;
        } else if (head.next != null) {
            Node<T> currentNode = head;
            Node<T> pastNode = null;
            int counter = 1;

            while (currentNode != null && counter != index) {
                pastNode = currentNode;
                currentNode = currentNode.next;
            }

            pastNode.next = currentNode.next; // remove item from list by pointing to next item

            CURRENT_SIZE--;
            return true;

        }
        return false;
    }

    /**
     * Resets head node.
     *
     * @return new object list
     */
    public boolean clear() {
        head = null;
        CURRENT_SIZE = 0;
        return true;
    }

    /**
     * Get current size of LinkedList
     *
     * @return int: size
     */
    public int size() {
        return this.CURRENT_SIZE;
    }

    /**
     * Checks for the first existence of object in LinkedList
     *
     * @param item
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
     * @param item
     * @return
     */
    public boolean insertAt(int index, T item) {
        if (size() < index || head == null)
            return false;
        else if (index == 0) {
            head.item = item;
            return true;
        } else if (head.next != null) {
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
        } else
            return false;
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
