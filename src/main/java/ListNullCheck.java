import java.util.ArrayList;
import java.util.List;

/**
 * Class showing how to ensure Lists do not throw NullPointerException
 */
public class ListNullCheck {
    public static void main(String args[]){
        List<String> stringList = new ArrayList<>();
        stringList.add("ele1");
        stringList.add("ele2");
        if(stringList != null && !stringList.isEmpty()){
            System.out.println(stringList.get(0));
        }
    }
}
