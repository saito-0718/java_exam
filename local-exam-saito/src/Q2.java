import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q2 {

    public static void main(String[] args) {
        int hour = 11;
        int minute = 59;
        int second = 59;

        LocalTime dateTime = LocalTime.of(hour, minute, second);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh時m分s秒");
        System.out.print(dateTime.format(formatter) + "の1秒後は");
        dateTime = dateTime.plusSeconds(1);
        System.out.println(dateTime.format(formatter) + "です。");

        // TODO 24時間表示まだ
        hour = 23;
        minute = 59;
        second = 59;
        dateTime = LocalTime.of(hour, minute, second);
        System.out.print(dateTime.format(formatter) + "の1秒後は");
        dateTime = dateTime.plusSeconds(1);
        System.out.println(dateTime.format(formatter) + "です。");
    }

}
