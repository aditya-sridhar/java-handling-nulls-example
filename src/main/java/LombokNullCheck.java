import lombok.NonNull;

import java.util.List;

/**
 * Class showing how to use Lombok to ensure null values are not sent to a function
 */
public class LombokNullCheck {
    public static void main(String args[]){
        String input2 = "test";
        List<String> inputList  = null;
        try {
            lombokNullCheck(input2, inputList, input2);
        }catch (NullPointerException e){
            System.out.println(e);
        }

    }

    public static void lombokNullCheck(@NonNull String str1,@NonNull List<String> strList,@NonNull String str2){
        System.out.println(str1.length() + strList.size() + str2.length());
    }
}
