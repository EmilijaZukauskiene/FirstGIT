package lt.sdacademy.fundamentals.varargs;

public class Example1 {

    public static void main(String[] args) {

        System.out.println(sum(1, 2, 3, 4));//10
        System.out.println(sum(1)); //1
        System.out.println(sum());
    }

    private static int sum(int... elements) { //... - rodo, kad masyvas yra nuo nulio iki begalybes - elements - varargsas
        int result = 0;

        for (int i : elements) {
            result += i;
        }
        return result;
    }
}