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

        // 1. Linked List
        List testLinked = new LinkedList();

        System.out.println("--- Adding ---");

        testLinked.add("first");
        testLinked.add("second");
        testLinked.add("third");

        System.out.println("Size: " + testLinked.size());
        DisplayResults(testLinked);

        testLinked.insertAt(1, "fourth");

        System.out.println("Size: " + testLinked.size());
        DisplayResults(testLinked);

        System.out.println("--- Removing ---");
        testLinked.remove("second");

        DisplayResults(testLinked);

        System.out.println("isEmpty(): " + testLinked.isEmpty());

        testLinked.removeAtIndex(0);

        DisplayResults(testLinked);

        testLinked.clear();

        System.out.println("isEmpty(): " + testLinked.isEmpty());
    }

    public static void DisplayResults(List x) {
        for(int i = 0; i < x.size(); i++)
            System.out.println(i + ": " + x.get(i));

    }
}
