import IList.LinkedList;
import IList.List;

/**
 * Developer: Abigail Lu
 * Date: 9/16/2018
 * Description: Implementing common data structures:
 * Lists:
 * Linked List
 * ,Queue
 * ,Stack
 * ,Deque
 * ,Set
 * <p>
 * Trees:
 * Binary Tree
 * ,N-ary Tree
 */

public class Main {

    public static void main(String[] args) {

        //List
        List testLinked = new LinkedList();

        testLinked.add("first");
        testLinked.add("second");
        testLinked.add("third");

        System.out.println("Size: " + testLinked.getSize());
    }
}
