import java.util.*;

public class tpYaourtsTM {
    public static void main(String[] args) {
        String[] json = { "rouge", "rouge", "jaune", "bleu", "jaune", "rouge", "jaune", "bleu", "bleu", "bleu" };
        LinkedHashMap<String, Integer> colors = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();

        for (int i = 0; i < json.length; i++) {
            if (colors.containsKey(json[i])) {
                int count = colors.get(json[i]);
                colors.put(json[i], count + 1);
            } else {
                colors.put(json[i], 1);
            }
        }

        colors.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry -> result.put(entry.getKey(), entry.getValue()));
        


        for (String i : colors.keySet()) {
            System.out.println("key: " + i + " value: " + colors.get(i));
        }
        for (String i : result.keySet()) {
            System.out.println("key: " + i + " value: " + result.get(i));
        }
    }
}
