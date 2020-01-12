package lt.sdacademy.advanced_features.object.pocket;

public class Main {
    public static void main(String[] args) {

        Pocket pocket1= new Pocket();
        Pocket pocket2 = new Pocket();
        Pocket pocket3 = new Pocket();

        pocket1.setMoney(100);
        pocket2.setMoney(5000);
        pocket3.setMoney(2);

        System.out.println(pocket1.getMoney());
        System.out.println(pocket2.getMoney());
        System.out.println(pocket3.getMoney());
    }
}
