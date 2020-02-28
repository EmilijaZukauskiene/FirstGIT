package lt.sdacademy.advanced_features.generics.exercise3;

public class TwoItems <T>{

    public T getEntry;
    public T getEntry1;
    public T getEntry2;
    private T item;

    public TwoItems(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    public TwoItems(){
    }

    public void setItem(T item) {
        this.item = item;
    }
}
