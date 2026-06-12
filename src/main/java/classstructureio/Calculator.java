package classstructureio;

import java.util.Scanner;

public class Calculator {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első számot:");
        int firstNumber = scanner.nextInt();

        System.out.println("Kérem a második számot:");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + " + " + secondNumber);
        System.out.println(firstNumber + secondNumber);

    }
}
