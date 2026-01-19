public class Exam6 {

    public static void main(String[] args) {
        int answer = calc(2, 3, '+');
        System.out.println("第1引数:2、第2引数:3、第3引数:'+' → 結果:" + answer);
        answer = calc(8, 2, '-');
        System.out.println("第1引数:8、第2引数:2、第3引数:'-' → 結果:" + answer);
        answer = calc(5, 4, '*');
        System.out.println("第1引数:5、第2引数:4、第3引数:'*' → 結果:" + answer);
        answer = calc(7, 2, '/');
        System.out.println("第1引数:7、第2引数:2、第3引数:'/' → 結果:" + answer);
        answer = calc(3, 8, '%');
        System.out.println("第1引数:3、第2引数:8、第3引数:'@' → 結果:" + answer);
    }

    static int calc(int num1, int num2, char ch) {
        if (ch == '+') {
            return num1 + num2;
        } else if (ch == '-') {
            return num1 - num2;
        } else if (ch == '*') {
            return num1 * num2;
        } else if (ch == '/') {
            return num1 / num2;
        } else {
            return -1;
        }
    }

}
