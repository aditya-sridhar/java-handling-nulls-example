import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class showing how to avoid null pointers in Maps
 */
public class MapNullCheck {
    public static void main(String args[]){
        Map<String,String> testMap = new HashMap<>();
        testMap.put("first_key","first_val");
        if(testMap.containsKey("first_key")){
            System.out.println(testMap.get("first_key"));
        }
        else{
            System.out.println("key not found");
        }

    }
}
