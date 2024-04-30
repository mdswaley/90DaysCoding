package Function;

public class BinaryToDecimalFun {
    public static int BinToDec(String n){
        int pw = 0;
        int dec = 0;
        for (int i = n.length()-1; i >= 0; i--) {
            char a = n.charAt(i);
            // (a-'0') for Converted the character a to its integer value by subtracting the character '0'. This is necessary to get the actual binary value (0 or 1) from the character representing it.
            // dec +=(a-'0') * Math.pow(2, pw);

            // or
            int digit = Integer.parseInt(String.valueOf(a));
            dec = dec + digit * (int)Math.pow(2,pw);
            pw++;
        }
        return dec;
    }
    public static void main(String[] args) {
        System.out.println(BinToDec("10100011"));
    }
}
