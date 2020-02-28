package lt.sdacademy.advanced_features.generics.genericClass.Example1;

public class GenericBox<T> {

    private T item;

    public GenericBox(T item) {
        this.item = item;
    }

    public GenericBox() {
    }
    public T getItem(){
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

