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

        System.out.println("--- Adding ---");

        testLinked.add("first");
        testLinked.add("second");
        testLinked.add("third");

        System.out.println("Size: " + testLinked.getNumObjects());
        DisplayResults(testLinked);

        testLinked.addAtIndex(1, "fourth");

        System.out.println("Size: " + testLinked.getNumObjects());
        DisplayResults(testLinked);

        testLinked.addRange(new Object[]{1, 2});

        System.out.println("Size: " + testLinked.getNumObjects());
        DisplayResults(testLinked);

        System.out.println("--- Removing ---");
        testLinked.remove("second");

        DisplayResults(testLinked);

        System.out.println("isEmpty(): " + testLinked.isEmpty());

        testLinked.removeAtIndex(0);

        DisplayResults(testLinked);

        testLinked.removeAll();

        System.out.println("isEmpty(): " + testLinked.isEmpty());
    }

    public static void DisplayResults(List x) {
        for(int i = 0; i < x.getNumObjects(); i++)
            System.out.println(i + ": " + x.get(i));

    }
}
