package StringBuilder;

public class string1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Mdswaley");
        System.out.println(sb);

        //charAt
        System.out.println(sb.charAt(2));

        //setCharAt():-it can add new value in given index
        sb.setCharAt(2, 'v');
        System.out.println(sb);

        //insert:-it add extra value in given string
        sb.insert(0, "w");
        System.out.println(sb);

        //delete:-delete any char in the given string .end index is not inclusive
        sb.delete(0, 2);
        System.out.println(sb);

        //append:-it help string builder for less memory and less time complexcity
        StringBuilder sb1 = new StringBuilder("M");// in only string we add string like String str = "M";
        sb1.append("D");//str = str + "D";
        sb1.append(" ");//str = str + " ";
        sb1.append("S");//str = str + "S";
        System.out.println(sb1);

        //length
        System.out.println(sb1.length());
        System.out.println(sb1.charAt(1));
        System.out.println(sb1.indexOf("S"));
        System.out.println(sb1.delete(0, 1));
        System.out.println(sb1.insert(2, 'S'));
        sb1.setCharAt(3,'W');
        System.out.println(sb1);
    }
}
