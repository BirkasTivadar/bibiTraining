package classstructuremethods;

import java.util.Scanner;

public class NoteMain {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        Note note = new Note();

        System.out.println("Kérem felhasználó nevét:");
        String name = scanner.nextLine();
        note.setName(name);

        System.out.println("Kérem jegyzet témáját:");
        String topic = scanner.nextLine();
        note.setTopic(topic);

        System.out.println("Kérem jegyzet szövegét:");
        String text = scanner.nextLine();
        note.setText(text);

        System.out.println("A felhasználó neve: " + note.getName());
        System.out.println("A jegyzet témája: " + note.getTopic());
        System.out.println("A jegyzet szövege: " + note.getText());
    }
}
