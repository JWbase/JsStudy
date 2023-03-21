package genericsEx;

public class Box<T> {
    public T content;

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.content = 100;
        int content = box.content;

    }
}
