package lt.sdacademy.fundamentals.objec_oriental.room;

import java.util.Scanner;

public class RoomMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite kambario ilgi");
        int width = scanner.nextInt();

        System.out.println("Iveskite kambario ploti");
        int length = scanner.nextInt();

        Room room = new Room(width, length);

        // int square0fRoom = room.getLength() * room.getWidth();
        int square0fRoom = getSquareOfRoom(room.getLength(), room.getWidth()); //susikurem funkcija- getScquareOfRoom, kintamojo pavadinimas - squareOfRoom

        System.out.println("Kambario plotas: " + square0fRoom);
    }

    private static int getSquareOfRoom(int length, int width) {
        return (length * width); // rasoma ka funkcija turi atlikti
    }
}
