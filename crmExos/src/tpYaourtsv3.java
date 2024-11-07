import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class tpYaourtsv3 {
    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
        URL url = new URL("https://api.devoldere.net/polls/yoghurts/");
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(new InputStreamReader(url.openStream()));
        JSONArray jcolors = (JSONArray) jsonObject.get("results");
        LinkedHashMap<String, Integer> colors = new LinkedHashMap<>();
        int count = 0;
        String result = "";
        String raw = "";
        for (int i = 0; i < jcolors.size(); i++) {
            if (colors.containsKey(jcolors.get(i))) {
                count = colors.get(jcolors.get(i));
                colors.put(jcolors.get(i).toString(), count + 1);
            } else {
                colors.put(jcolors.get(i).toString(), 1);
            }
        }
        Map.Entry<String, Integer> m = colors.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .findFirst()
                .get();
        raw += m;
        String[] split = raw.split("[=]");
        result += split[0] + " ";
        Map.Entry<String, Integer> n = colors.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .skip(1)
                .findFirst()
                .get();
        raw = "" + n;
        split = raw.split("[=]");
        result += split[0];
        for (String i : colors.keySet()) {
            System.out.println("key: " + i + " value: " + colors.get(i));
        }
        System.out.println(result);
    }
}
