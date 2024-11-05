import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class tpYaourts {
    public static void main(String[] args) {
        String[] json = { "rouge", "rouge", "jaune", "bleu", "jaune", "rouge", "jaune", "bleu", "arc" };
        LinkedHashMap<String, Integer> colors = new LinkedHashMap<>();
        int count = 0;
        String result = "";
        for (int i = 0; i < json.length; i++) {
            if (colors.containsKey(json[i])) {
                count = colors.get(json[i]);
                colors.put(json[i], count + 1);
            } else {
                colors.put(json[i], 1);
            }
        }

        Map.Entry<String, Integer> m = colors.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .findFirst()
                .get();
System.out.println(m);
        Map.Entry<String, Integer> n = colors.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .skip(1)
                .findFirst()
                .get();
System.out.println(n);


        // for (Map.Entry<String, Integer> entry : colors.entrySet()) {
        // if (entry.getValue() > currentMaxValue) {
        // resultList.clear();
        // resultList.add(entry.getKey());
        // currentMaxValue = entry.getValue();
        // } else if (entry.getValue() == currentMaxValue) {
        // resultList.add(entry.getKey());
        // }
        // }

        for (String i : colors.keySet()) {
            System.out.println("key: " + i + " value: " + colors.get(i));
        }
    }
}
