package StringBuilder;

public class revString2 {
    public static void main(String[] args) {
        String s = "mdswaley";
        String rev = "";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            rev = ch+rev;
        }
        System.out.println(rev);
    }
}
