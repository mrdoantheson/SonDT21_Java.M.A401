package fa.training.main;

import fa.training.entities.Multimedia;
import fa.training.entities.Song;
import fa.training.entities.Video;
import fa.training.management.MultimediaManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Multimedia> listOfMultimedia = new ArrayList<>();
        MultimediaManagement multimediaManagement = new MultimediaManagement(listOfMultimedia);

        boolean running = true;
        while (running) {
            System.out.println("1. Add a new song");
            System.out.println("2. Add a new video");
            System.out.println("3. Display all multimedia");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    Song song = new Song();
                    song.createMultimedia(scanner);
                    multimediaManagement.addMultimedia(song);
                }
                case 2 -> {
                    Video video = new Video();
                    video.createMultimedia(scanner);
                    multimediaManagement.addMultimedia(video);
                }
                case 3 -> multimediaManagement.displayMultimedia();
                case 4 -> running = false;
                default -> System.out.println("Invalid choice, please try again.");
            }

            System.out.println();
        }
        scanner.close();
    }
}
