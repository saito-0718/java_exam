public class Q4 {

    public static void main(String[] args) {
        int year = 2100;
        System.out.println(getPrintString(year, isUruYear(year)));
    }

    static boolean isUruYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    static String getPrintString(int year, boolean isUruYear) {
        if (isUruYear) {
            return year + "年はうるう年です。";
        } else {
            return year + "年はうるう年ではありません。";
        }
    }

}
