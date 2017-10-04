
import java.util.Scanner;

public class Hello_thePerson {
    public static void main(String arg [])
    {
        String name;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("PLease tell your name?");
        name=keyboard.next();
        //System.out.println("Hello "+name);
        System.out.println(heyThere(name));

    }
public static String heyThere(String name)
{

        return "Hello, "+name+"!";
}
}