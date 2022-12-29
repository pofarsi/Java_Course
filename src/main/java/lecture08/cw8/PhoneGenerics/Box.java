package lecture08.cw8.PhoneGenerics;

/* Generics classes, we use<> in front of name of class. for naming generics we can use anything,
    but we should follow convention. */
public class Box<T> {
    // Here T could be anything Integer, Point, etc.
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
