
public class RecursiveString {
    public static void main(String[] args) {
        String str = "xaxabxc";
        char target = 'x';
        System.out.print(" " + ModifyString(str, target));
    }

    static String ModifyString(String str, char target) {
        if (str.length() == 0)
            return "";
        char firstchar = str.charAt(0);
        String remaining = str.substring(1);
        if (firstchar == target) {
            return ModifyString(remaining, target);
        } else {
            return firstchar + ModifyString(remaining, target);
        }

    }

}