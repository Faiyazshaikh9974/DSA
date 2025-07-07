import java.util.*;

public class String_pratice {
    //we can create String like this 


    public static void main(String[] args) {

        
    // String name = "Faiyaz shaikh";
    // String lastName = new String("Shaikh");
    //     System.out.println(name + "" + lastName); //string concatination

    Scanner sc = new Scanner(System.in);

    String name = sc.nextLine();

    //string are immutable in java keep in mind
    System.out.println("String Length is: "+ name.length());

    System.out.println(name.charAt(0));

    }

}
