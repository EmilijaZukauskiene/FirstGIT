package lt.sdacademy.designpatterns.structural.behavioral.command;

import lt.sdacademy.designpatterns.structural.behavioral.command.example.BubbleSort;
import lt.sdacademy.designpatterns.structural.behavioral.command.example.BucketSort;
import lt.sdacademy.designpatterns.structural.behavioral.command.example.CommandInterface;
import lt.sdacademy.designpatterns.structural.behavioral.command.example.Controler;
import lt.sdacademy.designpatterns.structural.behavioral.command.example.HeapSort;
import lt.sdacademy.designpatterns.structural.behavioral.command.example.MergeSort;
import lt.sdacademy.designpatterns.structural.behavioral.command.example.QuickSort;

public class Command {

    private static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int n = (int) (Math.random() * 20 + 1);
            arr[i] = n;
        }
        return arr;
    }

    public static void main(String[] args) {
        Controler controler = new Controler();
        int[] arr = generateRandomArray(10000);
        CommandInterface bubbleSort = new BubbleSort(arr.clone());
        CommandInterface quickSort = new QuickSort(arr.clone());
        CommandInterface bucketSort = new BucketSort(arr.clone());
        CommandInterface mergeSort = new MergeSort(arr.clone());
        CommandInterface heapSort = new HeapSort(arr.clone());

        controler.setCommand(bubbleSort);
        controler.runSort();

        controler.setCommand(quickSort);
        controler.runSort();

        controler.setCommand(bucketSort);
        controler.runSort();

        controler.setCommand(mergeSort);
        controler.runSort();

        controler.setCommand(heapSort);
        controler.runSort();
    }
}
