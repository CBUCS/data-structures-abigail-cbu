import IList.LinkedList;
import IList.List;
import IList.Queue;

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

        System.out.println("--- Linked List ---");
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

        DisplayResults(testLinked);

        // 2. Queue
        Queue testQueue = new Queue();
        System.out.println("--- Queue ---");
        System.out.println("--- Adding ---");

        testQueue.add("first");
        testQueue.add("second");
        testQueue.add("third");
        testQueue.add(1);
        testQueue.add(2);
        testQueue.add(3);


        System.out.println("Size: " + testQueue.size());
        DisplayResults(testQueue);

        testQueue.insertAt(1, "fourth");

        System.out.println("Size: " + testQueue.size());
        DisplayResults(testQueue);

        System.out.println("--- Removing ---");
        testQueue.remove();
        testQueue.remove(2);
        testQueue.remove(3);

        DisplayResults(testQueue);

        System.out.println("isEmpty(): " + testQueue.isEmpty());

        testQueue.removeAtIndex(3);

        DisplayResults(testQueue);

        testQueue.clear();

        System.out.println("isEmpty(): " + testQueue.isEmpty());

        DisplayResults(testQueue);



    }

    public static void DisplayResults(List x) {
        for(int i = 0; i < x.size(); i++)
            System.out.println(i + ": " + x.get(i));

    }
}
