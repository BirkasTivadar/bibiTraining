package classstructureio;

import java.util.Scanner;

public class Registration {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a nevét:");
        String name = scanner.nextLine();

        System.out.println("Kérem az email címét:");
        String email = scanner.nextLine();

        System.out.println("Tisztelt " + name + ", Ön az alábbi adatokkal regisztrált:");
        System.out.println("Név: " + name);
        System.out.println("Email: " + email);


    }
}
