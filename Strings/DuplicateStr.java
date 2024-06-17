package Strings;

public class DuplicateStr {
    public static void main(String[] args) {
        String str = "abcda";
        String newStr = "";
        /*For strings: The indexOf() method searches the specified substring within the string and returns the index of the first occurrence of that substring. If the substring is not found, it returns -1. */

        /*
          String str = "hello world";
          Find the index of the substring "world"
          int index1 = str.indexOf("world"); // index1 will be 6
         */

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // if in newstr find the char then print its index 
            // if not find in newStr the it return -1 bcz not exist value.
            if (newStr.indexOf(ch) == -1) {
                newStr = newStr + ch;
            }
        }
        System.out.println(newStr);
    }
}
