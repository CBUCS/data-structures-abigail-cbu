package ITree;

public interface Tree<T> {

    boolean insert(T item);

    boolean find(T item);

    void dumpDFS(T item); // where dfs stands for Depth First Search

    void dumpBFS(T item); // where bfs stands for Breadth First Search

    int size();

}
