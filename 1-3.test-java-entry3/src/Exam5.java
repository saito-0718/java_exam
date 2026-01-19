public class Exam5 {

    public static void main(String[] args) {
        System.out.println("足し算結果:" + addtion(5, 3));
        System.out.println("引き算結果:" + subtraction(5, 3));
        System.out.println("掛け算結果:" + multiplication(5, 3));
        System.out.println("割り算結果:" + division(5, 3));
        System.out.println("剰余結果:" + remainder(5, 3));
    }

    static int addtion(int num1, int num2) {
        return num1 + num2;
    }

    static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    static int division(int num1, int num2) {
        return num1 / num2;
    }

    static int remainder(int num1, int num2) {
        return num1 % num2;
    }
}
