import java.util.*;

public class tpYaourtsTM {
    public static void main(String[] args) {
        String[] json = { "rouge", "rouge", "jaune", "bleu", "jaune", "rouge", "jaune", "bleu", "bleu", "bleu" };
        LinkedHashMap<String, Integer> colors = new LinkedHashMap<>();
        // final List<String> resultList = new ArrayList<String>();
        // int currentMaxValue = 0;
        for (int i = 0; i < json.length; i++) {
            if (colors.containsKey(json[i])) {
                int count = colors.get(json[i]);
                colors.put(json[i], count + 1);
            } else {
                colors.put(json[i], 1);
            }
        }

        int[] selectColors = colors.entrySet().parallelStream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .limit(2)
                .mapToInt(entry -> entry.getValue())
                .toArray();

        // while (resultList.size() < 2) {
        // for (Map.Entry<String, Integer> entry : colors.entrySet()) {
        // if (entry.getValue() > currentMaxValue) {
        // resultList.clear();
        // resultList.add(entry.getKey());
        // currentMaxValue = entry.getValue();
        // } else if (entry.getValue() == currentMaxValue) {
        // resultList.add(entry.getKey());
        // }
        // }
        // }
        System.out.println(selectColors);
    }
}
