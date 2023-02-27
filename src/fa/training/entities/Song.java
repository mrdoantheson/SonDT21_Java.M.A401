package fa.training.entities;

import java.util.Scanner;

public class Song extends Multimedia {
    private String singer;

    public Song() {
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public void createMultimedia(Scanner scanner) {
        System.out.println("----Enter song information------");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        setName(name);

        System.out.print("Enter duration: ");
        double duration = Double.parseDouble(scanner.nextLine());
        setDuration(duration);

        System.out.print("Enter singer: ");
        singer = scanner.nextLine();
        setSinger(singer);
    }

    @Override
    public String toString() {
        return "Song: " + '\t' + '\t' + getName() + '\t' + getDuration() + '\t' + '\t' + singer;
    }
}
