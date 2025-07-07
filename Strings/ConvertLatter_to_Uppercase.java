package Strings;

public class ConvertLatter_to_Uppercase {

    public static String firstLatterTOUpperCase(String str) {

        StringBuilder sc = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));

        sc.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i <str.length() -1) {
                sc.append(str.charAt(i));
                i++;
                sc.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sc.append(str.charAt(i));
            }
        }
        String newstr = sc.toString();
        return newstr;
    }

    public static void main(String[] args) {
        String str = "shaikh faiyaz from juhapura ahmedabad";
        System.out.println(firstLatterTOUpperCase(str));
    }
}
