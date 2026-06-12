package classstructureattributes;

import java.util.Scanner;

public class Music {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        System.out.println("Kérem a zenekar nevét:");
        song.band = scanner.nextLine();

        System.out.println("Kérem a szám címét:");
        song.title = scanner.nextLine();

        System.out.println("Kérem a szám hosszát:");
        song.length = scanner.nextInt();

        System.out.println(song.band + " - " + song.title + " (" + song.length + " perc)");
    }
}
