package lt.sdacademy.designpatterns.structural.behavioral.command.shellSort;

import lt.sdacademy.designpatterns.structural.behavioral.command.example.CommandInterface;

import javax.sound.midi.Soundbank;

public class ShellSort implements CommandInterface {

    private int[] arr;

    public ShellSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void execute() {
        long timestamp = System.currentTimeMillis();
        System.out.println("Buble sort");
        CommandInterface.printArray(arr, "Before");
        sort();
        CommandInterface.printArray(arr, "After");
        System.out.println("Buble Sort");
    }

    private void sort() {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
        }
    }
}
/*
1. Create ShellSort class implementing the CommandInterface interface.
        2. In the ShellSort class, create a sort method, sorting an array of integers using the
        Shellsort algorithm.
        3. Check the sorting speed, compare the result with other algorithms.*/
