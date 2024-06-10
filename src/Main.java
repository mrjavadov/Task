import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "Allahverdi";
        String password = "a123456@";

        String un = sc.next();
        String ps = sc.next();

        if (un.equals(username) && ps.equals(password)) {

            System.out.println("Success");
        } else {

            System.out.println("Dogru deyil");
        }
    }
}

