package ITree;

import IList.LinkedList;
import IList.Node;

public class BinaryTree<T> implements Tree<T>{

    private Node<T> root;
    private LinkedList<T> tree = new LinkedList();
    private int CURRENT_SIZE = 0;
    public BinaryTree () {
        this.root = null;
    }


    /**
     * insert into binary tree from left to right
     * @param item
     * @return
     */
    public boolean insert(T item) {
        Node<T> newNode = new Node<T>();
        newNode.item = item;
        newNode.left = null;
        newNode.right = null;

        if(root == null)
        {
            root = newNode;
            CURRENT_SIZE++;
        }
        else
        {
            Node<T> tmpNode = root;
            int index = 0;

            // this is putting the new nodes from left to right of tree
            while(index < CURRENT_SIZE) {
                if(tmpNode.left == null)
                {
                    tmpNode.left = newNode;
                    break;
                }
                else if (tmpNode.right == null)
                {
                    tmpNode.right = newNode;
                    break;
                }
                else {
                    if(tmpNode.right != null)
                        tmpNode = tmpNode.right;
                    else
                        tmpNode = tmpNode.left;
                }
            }
            CURRENT_SIZE++;
        }
        return true;
    }

    public boolean find(T item) {
        return false;
    }

    public void dumpDFS(T item) {

    }

    public void dumpBFS(T item) {

    }

    public T get(int index) {
        if (index > size() || root == null)
            return null; // doesn't exists
        else if (index == 0) {
            return root.item;
        } else {
            Node<T> tmpNode = root;

            return tmpNode.item; // there is no item at specified index
        }
    }

    public int size() {
        return CURRENT_SIZE;
    }
}
