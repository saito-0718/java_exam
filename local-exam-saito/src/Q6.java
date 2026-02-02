public class Q6 {

    public static void main(String[] args) {
        int num1 = (int) Math.floor(Math.random() * 10);
        int num2 = (int) Math.floor(Math.random() * 10);
        int num3 = (int) Math.floor(Math.random() * 10);
        String num1Str = String.valueOf(num1);
        String num2Str = String.valueOf(num2);
        String num3Str = String.valueOf(num3);
        System.out.println(num1Str + num2Str + num3Str);
        System.out.println(num1Str + num3Str + num2Str);
        System.out.println(num2Str + num1Str + num2Str);
        System.out.println(num2Str + num3Str + num1Str);
        System.out.println(num3Str + num1Str + num2Str);
        System.out.println(num3Str + num2Str + num1Str);
    }

}
