package classstructuremethods;

import java.util.Scanner;

public class ClientMain {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Kérem a nevet:");
        String name =  scanner.nextLine();
        client.setName(name);

        System.out.println("Kérem a születési évet:");
        int year = scanner.nextInt();
        client.setYear(year);
        scanner.nextLine();

        System.out.println("Kérem a címet:");
        String address =  scanner.nextLine();
        client.setAddress(address);

        System.out.println("Az ön neve: " + client.getName() +
                ", a születési éve: " + client.getYear() +
                ", címe: " + client.getAddress());

        System.out.println("Kérem az új címet:");
        address =  scanner.nextLine();
        client.migration(address);

        System.out.println("Az ön neve: " + client.getName() +
                ", a születési éve: " + client.getYear() +
                ", új címe: " + client.getAddress());





    }
}
