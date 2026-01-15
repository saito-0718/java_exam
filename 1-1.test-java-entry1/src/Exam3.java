public class Exam3 {

    public static void main(String[] args) {
        int taxOutPrice = 200 * 3 + 250 * 4;
        int taxRate = 10;
        int tax = taxOutPrice * taxRate / 100;
        int taxInPrice = taxOutPrice + tax;

        System.out.println("小計");
        System.out.println(taxOutPrice + "円");
        System.out.println("消費税");
        System.out.println(tax + "円");
        System.out.println("合計金額");
        System.out.println(taxInPrice + "円");

    }

}
