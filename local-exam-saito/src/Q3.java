import java.time.LocalDate;

//TODO
public class Q3 {

    public static void main(String[] args) {
        int year = 2000;
        if (year <= 1 && year <= 100) {
            System.out.println(getPrintString(year, 1));
        } else if (year <= 101 && year <= 200) {
            System.out.println(getPrintString(year, 2));
        } else if (year <= 201 && year <= 300) {
            System.out.println(getPrintString(year, 3));
        } else if (year <= 301 && year <= 400) {
            System.out.println(getPrintString(year, 4));
        } else if (year <= 401 && year <= 500) {
            System.out.println(getPrintString(year, 5));
        } else if (year <= 501 && year <= 600) {
            System.out.println(getPrintString(year, 6));
        } else if (year <= 601 && year <= 700) {
            System.out.println(getPrintString(year, 7));
        } else if (year <= 701 && year <= 800) {
            System.out.println(getPrintString(year, 8));
        } else if (year <= 801 && year <= 900) {
            System.out.println(getPrintString(year, 9));
        } else if (year <= 901 && year <= 1000) {
            System.out.println(getPrintString(year, 10));
        } else if (year <= 1001 && year <= 1100) {
            System.out.println(getPrintString(year, 11));
        } else if (year <= 1101 && year <= 1200) {
            System.out.println(getPrintString(year, 12));
        } else if (year <= 1201 && year <= 1300) {
            System.out.println(getPrintString(year, 13));
        } else if (year <= 1301 && year <= 1400) {
            System.out.println(getPrintString(year, 14));
        } else if (year <= 1401 && year <= 1500) {
            System.out.println(getPrintString(year, 15));
        } else if (year <= 1501 && year <= 1600) {
            System.out.println(getPrintString(year, 16));
        } else if (year <= 1601 && year <= 1700) {
            System.out.println(getPrintString(year, 17));
        } else if (year <= 1701 && year <= 1800) {
            System.out.println(getPrintString(year, 18));
        } else if (year <= 1801 && year <= 1900) {
            System.out.println(getPrintString(year, 19));
        } else if (year <= 1901 && year <= 2000) {
            System.out.println(getPrintString(year, 20));
        } else if (year <= 2001 && year <= 2100) {
            System.out.println(getPrintString(year, 21));
        } else if (year <= 2101 && year <= 2200) {
            System.out.println(getPrintString(year, 22));
        } else if (year <= 2201 && year <= 2300) {
            System.out.println(getPrintString(year, 23));
        }
    }

    static String getPrintString(int year, int period) {
        return year + "年は" + period + "世紀です。";
    }

}
