import java.util.HashMap;
// Has maps in JAVA use an array of linked lists
public class HashMapTest {
    private static HashMap<String, String> capitalCities;

        public static void main(String[] args) {
            // Create a HashMap object called capitalCities
            capitalCities = new HashMap<String, String>();

            // Add keys and values (Country, City)
            capitalCities.put("England", "London");
            capitalCities.put("Germany", "Berlin");
            capitalCities.put("Norway", "Oslo");
            capitalCities.put("USA", "Washington DC");
            capitalCities.forEach((key,value)->{System.out.println(key);});
            System.out.println(capitalCities);
            displayValues();
        }

        public static void displayValues(){
            System.out.println(capitalCities.get("England"));
        }
}
