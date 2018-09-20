package ITree;

public interface Tree {

    boolean add (Object o);
    boolean remove (Object o);
    boolean contains (Object o);
    int checkSize ();
    int getCurrentIndex (Object o);

}
