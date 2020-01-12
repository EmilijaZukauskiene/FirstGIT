package lt.sdacademy.algorithsanddatastructure.algorithms.binnary_search;

public class Find_Number_In_Array {
    private static final int VALUE_TO_FIND = 9;

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int left = 0;
        int right = number.length - 1;
        int mid;

        boolean found = false;

        while (left <= right) {
            mid = (left + right) / 2;
            if (VALUE_TO_FIND == number[mid]) {
                System.out.printf("Found value %d at position %d.", VALUE_TO_FIND, mid + 1); // %d - ikisam VALUE_TO_FIND reiksme; mid+1 reiksme               found = true;
                break;
            } else {
                if (VALUE_TO_FIND < number[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (!found) {
                System.out.println("Value not found");
            }
        }
    }
}
