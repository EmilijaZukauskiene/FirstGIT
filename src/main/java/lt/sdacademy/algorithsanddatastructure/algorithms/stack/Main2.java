package lt.sdacademy.algorithsanddatastructure.algorithms.stack;

public class Main2 {
    public static void main(String[] args) {
        CustomStack2 stack = new CustomStack2(5);

        System.out.println("Stack empty - ?" + stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack peek - " + stack.peek());
        stack.pop();
        stack.push(7);
        while (!stack.isEmpty()){
            stack.pop();
        }
        System.out.println("Stack is empty - " + stack.isEmpty());
        stack.pop();
    }
}
