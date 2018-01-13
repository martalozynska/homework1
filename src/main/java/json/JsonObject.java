package json;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {

    ArrayList<JsonPair> objects = new ArrayList<>();

    public JsonObject(JsonPair... jsonPairs) {
        objects.addAll(Arrays.asList(jsonPairs));
    }

    @Override
    public String toJson() {
        StringBuilder string = new StringBuilder("{");
        int counter = 0;
        for (JsonPair jsonPair : objects) {
            String key = jsonPair.key;
            string.append(" " + key + " :" + " " + jsonPair.value.toJson() + " ");
            ++counter;
            if (counter < objects.size()) {
                string.append(", ");
            }
        }
        string.append("}");
//String.format("%s : %s ", key, jsonPair.value.toJson())
        return string.toString();
    }

    public void add(JsonPair jsonPair) {
        // ToDo
    }

    public Json find(String name) {
        // ToDo
        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        return null;
    }

}
