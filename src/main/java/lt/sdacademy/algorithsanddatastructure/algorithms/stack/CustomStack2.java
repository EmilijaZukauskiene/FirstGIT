package lt.sdacademy.algorithsanddatastructure.algorithms.stack;

public class CustomStack2 {
    private int[] arr;
    private int size;
    private int top;
    public CustomStack2(int size) {
        this.arr = new int[size];
        this.size = size;
        this.top = -1;
    }
    public void push(int num) {
        //ar stackas nera pilnas?
        if (isFull()) {
            System.out.println("Stack is full");
        }
        top++;
        arr[top] = num;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        int element = arr[top];
        top --;
        return element;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return arr[top];
    }
    public boolean isFull() {
        return top == size;
    }
    public boolean isEmpty() {
        return top < 0;
    }
}
