package fa.training.entities;

import java.util.Scanner;

public class Video extends Multimedia {
    private String director;

    public Video() {
    }

    public Video(String name, double duration, String director) {
        super(name, duration);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void createMultimedia(Scanner scanner) {
        System.out.println("----Enter video information------");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        setName(name);

        System.out.print("Enter duration: ");
        double duration = Double.parseDouble(scanner.nextLine());
        setDuration(duration);

        System.out.print("Enter name of the director: ");
        String director = scanner.nextLine();
        setDirector(director);
    }

    @Override
    public String toString() {
        return "Video: " + '\t' + '\t' + getName() + '\t'+ '\t' + getDuration() + '\t' + director;
    }
}
