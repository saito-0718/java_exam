import java.util.ArrayList;
import java.util.List;

public class Exam3 {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee gotou = new Employee("後藤", 31);
        Employee yamada = new Employee("山田", 28);
        Employee sato = new Employee("佐藤", 25);
        Employee tanaka = new Employee("田中", 19);

        list.add(gotou);
        list.add(yamada);
        list.add(sato);
        list.add(tanaka);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "(" + list.get(i).getAge() + "歳)");
        }

    }

}
