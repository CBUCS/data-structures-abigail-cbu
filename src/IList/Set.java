package IList;

public class Set implements List{

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int checkSize() {
        return 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }
}
