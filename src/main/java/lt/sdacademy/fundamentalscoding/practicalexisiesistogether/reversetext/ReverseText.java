package lt.sdacademy.fundamentalscoding.practicalexisiesistogether.reversetext;

import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);
        String text;
        String reverseText = "";

        System.out.println("Iveskite teksta");
        text = textScanner.nextLine();

        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText += text.charAt(i); // apsuka teksta
        }
        System.out.println(reverseText);
    }
}
