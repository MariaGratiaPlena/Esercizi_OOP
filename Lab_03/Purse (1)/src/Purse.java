import java.util.ArrayList;
import java.util.List;

public class Purse {

    public static Coin DOLLAR = new Coin("Dollar", 1);
    public static Coin QUARTER = new Coin("Quarter", 0.25);
    public static Coin DIME = new Coin("Dime", 0.10);
    public static Coin NICKEL = new Coin("Nickel", 0.05);
    public static Coin CENT = new Coin("Cent", 0.01);

    private final List<Coin> coins;

    public Purse() {
        coins = new ArrayList<>();
    }

    public void add(Coin coin) {
        coins.add(coin);
    }

    public boolean find(Coin coin) {
        return coins.contains(coin);
    }

    public int count(Coin coin) {
        int number = 0;
        for (int i = 0; i < coins.size(); i++) {
            if(coins.get(i).equals(coin)) number++;
        }
        return number;
    }

    public Coin getMinimum() {
        Coin minimum = coins.get(0);
        for (int i = 0; i < coins.size(); i++) {
            if(coins.get(i).getValue() < minimum.getValue()) minimum = coins.get(i);
        }
        return minimum;
    }

    public Coin getMaximum() {
        Coin maximum = coins.get(0);
        for (int i = 0; i < coins.size(); i++) {
            if(coins.get(i).getValue() > maximum.getValue()) maximum = coins.get(i);
        }
        return maximum;
    }

    public double getTotal() {
        double sum = 0;
        for (int i = 0; i < coins.size(); i++) {
            sum+=coins.get(i).getValue();
        }
        return sum;
    }

    public void remove(Coin coin) {
        coins.remove(coin);
    }

    public boolean hasCoin(Coin coin) {
        return coins.contains(coin);
    }

    @Override
    public String toString() {
        int countdollar = count(DOLLAR);
        int countquarter = count(QUARTER);
        int countdime = count(DIME);
        int countnickel = count(NICKEL);
        int countcent = count(CENT);
        return "Purse[Dollar = "+countdollar+", Quarter = "+countquarter+", Dime = "+countdime+", Nickel = "+ countnickel+", Cent = "+countcent+"]";
    }

    @Override
    public boolean equals(Object o) {
        Purse other = (Purse) o;
        boolean isEqual = false;
        if (this.coins.size() != other.coins.size()) return isEqual;
        for (int i = 0; i < this.coins.size(); i++) {
            if(this.coins.get(i).equals(other.coins.get(i))) isEqual = true;
            else isEqual = false;
        }
        return isEqual;
    }
}