package Generic;

public class StringContainer<T> implements ContainerInterface<T> {

    private T item;


    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}
