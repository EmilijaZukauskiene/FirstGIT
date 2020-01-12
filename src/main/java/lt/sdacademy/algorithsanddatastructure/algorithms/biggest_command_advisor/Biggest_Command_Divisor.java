package lt.sdacademy.algorithsanddatastructure.algorithms.biggest_command_advisor;

public class Biggest_Command_Divisor {
    public static void main(String[] args) {
        int a = 24;
        int b = 18;

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Number is" + a);
    }
}
