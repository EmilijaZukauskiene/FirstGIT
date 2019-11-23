/*package lt.sdacademy.fundamentalscoding.practicalexercises.maxvalue;

import java.util.Scanner;

public class MaxValueSearchMain {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Iveskite skaicius");
        int x = inputScanner.nextInt();
        String numbersInText = inputScanner.nextLine();
        String[] numberArr = numbersInText.split(","); //atskiria zodzius kabutemis, kairej pusej sukuriam masyva, o disinej inicializuojam

        int max = Integer.parseInt(numberArr[0]); //tekstas verciamas skaiciumi, tekstines reiksmes skaiciai paverciami int tipo su Integer,parseInt("Skaicius")
        for (int i = 0; i < numberArr.length,i++){
            int number = Integer.parseInt(numberArr[1]);
            if (number > max) {
                max = number;
            }
            System.out.println("Maksimali reiksme is saraso yra: " + max);
        }
    }
}
//private static Integer texToInt(String textNumber){
//return Integer.parseInt(textNumber);
*/