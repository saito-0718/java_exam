import java.util.HashMap;
import java.util.Map;

public class Q5 {
    static final String SOCCER = "soccer";
    static final String BASEBALL = "baseball";
    static final String JOGGING = "jogging";
    static final String SURFFING = "surfing";
    static final String BOXING = "boxing";

    public static void main(String[] args) {
        String[] sports = { "soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer",
                "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging",
                "baseball", "soccer", "soccer" };
        Map<String, Integer> map = countSports(sports);
        System.out.println(getMostSport(map));

    }

    static String getMostSport(Map<String, Integer> map) {
        // soccerと比べる
        if (map.get(SOCCER) > map.get(BASEBALL) && //
                map.get(SOCCER) > map.get(JOGGING) && //
                map.get(SOCCER) > map.get(SURFFING) && //
                map.get(SOCCER) > map.get(BOXING)) {
            return "最も出現回数の多いスポーツは" + SOCCER + "で、出現回数は" + map.get(SOCCER) + "回です。";
        } else if (map.get(BASEBALL) > map.get(JOGGING) && //
                map.get(BASEBALL) > map.get(SURFFING) && //
                map.get(BASEBALL) > map.get(BOXING)) {
            return "最も出現回数の多いスポーツは" + BASEBALL + "で、出現回数は" + map.get(BASEBALL) + "回です。";
        } else if (map.get(JOGGING) > map.get(SURFFING) && //
                map.get(JOGGING) > map.get(BOXING)) {
            return "最も出現回数の多いスポーツは" + JOGGING + "で、出現回数は" + map.get(JOGGING) + "回です。";
        } else if (map.get(SURFFING) > map.get(BOXING)) {
            return "最も出現回数の多いスポーツは" + SURFFING + "で、出現回数は" + map.get(SURFFING) + "回です。";
        } else {
            return "最も出現回数の多いスポーツは" + BOXING + "で、出現回数は" + map.get(BOXING) + "回です。";
        }
    }

    static Map<String, Integer> countSports(String[] sports) {
        Map<String, Integer> map = new HashMap<>();
        int soccerCount = 0;
        int baseballCount = 0;
        int joggingCount = 0;
        int surfingCount = 0;
        int boxingCount = 0;

        for (int i = 0; i < sports.length; i++) {
            if (sports[i].equals(SOCCER)) {
                soccerCount++;
            } else if (sports[i].equals(BASEBALL)) {
                baseballCount++;
            } else if (sports[i].equals(JOGGING)) {
                joggingCount++;
            } else if (sports[i].equals(SURFFING)) {
                surfingCount++;
            } else if (sports[i].equals(BOXING)) {
                boxingCount++;
            }
        }
        map.put(SOCCER, soccerCount);
        map.put(BASEBALL, baseballCount);
        map.put(JOGGING, joggingCount);
        map.put(SURFFING, surfingCount);
        map.put(BOXING, boxingCount);
        return map;
    }
}
