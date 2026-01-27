import java.util.LinkedList;
import java.util.List;

public class ShoppingCart extends LinkedList<Item> {

    List<Item> items;

    public int getTotalPrice() {
        int total = 0;
        for (int i = 0; i < items.size(); i++) {
            total = total + items.get(i).getPrice();
        }
        return total;
    }

    public int getAveragePrice() {
        int total = 0;
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            total = total + items.get(i).getPrice();
            count++;
        }
        return total / count;
    }

}
