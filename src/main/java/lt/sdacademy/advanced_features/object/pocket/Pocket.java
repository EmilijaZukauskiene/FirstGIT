package lt.sdacademy.advanced_features.object.pocket;

public class Pocket {
    private int money;

    public int getMoney() {
        if (this.money <= 10) {
            return 0;
        }
        return money;
    }

    public void setMoney(int money) {
        if (money < 0 || money > 3000) {
            System.out.println("I don't have enought space in my pocket for as much money!");
        } else {
            this.money = money;
        }
    }
}
