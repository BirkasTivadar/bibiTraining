package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Kérem a nevet:");
        client.name = scanner.nextLine();

        System.out.println("Kérem a születési évet:");
        client.year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem a címet:");
        client.address = scanner.nextLine();

        System.out.println("Az ön neve: " + client.name +
                        ", a születési éve: " + client.year +
                        ", címe: " + client.address);
    }
}
