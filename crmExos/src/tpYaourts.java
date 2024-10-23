import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class tpYaourts {
    public static void main(String[] args) {
        String[] json = { "rouge", "rouge", "jaune", "bleu", "jaune", "rouge", "jaune" };
        HashMap<String, Integer> colors = new HashMap<String, Integer>();
        int count = 0;
        int currentMaxValue = Integer.MIN_VALUE;
        final List<String> resultList = new ArrayList<String>();
        for (int i = 0; i < json.length; i++) {
            if (colors.containsKey(json[i])) {
                count = colors.get(json[i]);
                colors.put(json[i],count + 1);
            }
            else {
                colors.put(json[i], 1);
            }
        }
            
        }
        
        for (Map.Entry<String, Integer> entry : colors.entrySet()) {
            if (entry.getValue() > currentMaxValue) {
                resultList.clear();
                resultList.add(entry.getKey());
                currentMaxValue = entry.getValue();
            }
            else if (entry.getValue() == currentMaxValue) {
                resultList.add(entry.getKey());
            }
        }
        System.out.println(resultList);
        for (String i : colors.keySet()) {
            System.out.println("key: " + i + " value: " + colors.get(i));
        }
        System.out.println(colors.size());
        System.out.println(colors.keySet());
    }
}
