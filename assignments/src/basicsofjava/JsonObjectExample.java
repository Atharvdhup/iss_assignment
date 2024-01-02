
package basicsofjava;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

public class JsonObjectExample {

    public static void main(String[] args) throws IOException, ParseException {
        // Creating a JSON object
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Sainath"); 
        jsonObject.put("age", 25);
        
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("English");
        subjects.add("Maths");
        subjects.add("Hindi");
        subjects.add("Marathi");
        jsonObject.put("subjects", subjects);

        // Displaying the original JSON object
        System.out.println("Original JSON object: ");
        System.out.println(jsonObject);

        // Converting JSON object to JSON string
        StringWriter stringWriter = new StringWriter();
        jsonObject.writeJSONString(stringWriter);
        String jsonString = stringWriter.toString();

        // Displaying the JSON string
        System.out.println("\nJSON string: ");
        System.out.println(jsonString);

        // Parsing JSON string back to JSON object
        JSONParser parser = new JSONParser();
        Object parsedObject = parser.parse(jsonString);

        if (parsedObject instanceof JSONObject) {
            // Displaying the parsed JSON object
            System.out.println("\nParsed JSON object: ");
            JSONObject parsedJsonObject = (JSONObject) parsedObject;
            System.out.println(parsedJsonObject);

            // Accessing values from the parsed JSON object
            String parsedName = (String) parsedJsonObject.get("name");
            long parsedAge = (long) parsedJsonObject.get("age");
            ArrayList<String> parsedSubjects = (ArrayList<String>) parsedJsonObject.get("subjects");

            System.out.println("\nName: " + parsedName);
            System.out.println("Age: " + parsedAge);
            System.out.println("Subjects: " + parsedSubjects);
        } else {
            System.out.println("Error: Unable to parse JSON string");
        }
    }
}