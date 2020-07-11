/**
 * class Showing how to avoid Null Pointer Exception for Strings
 */
public class SimpleNullCheck {
    public static void main(String args[]){
        String input1 = null;
        simpleNullCheck(input1);

    }

    private static void simpleNullCheck(String str1) {
        String str2 = str1;
        if(str2 != null){
            System.out.println(str2.length());
        }else{
            System.out.println("String is null");
        }
    }
}
