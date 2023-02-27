package fa.training.management;

import fa.training.entities.Multimedia;

import java.util.List;

public class MultimediaManagement {
    public List<Multimedia> listOfMultimedia;

    public MultimediaManagement(List<Multimedia> listOfMultimedia) {
        this.listOfMultimedia = listOfMultimedia;
    }

    public void addMultimedia(Multimedia multimedia) {
        listOfMultimedia.add(multimedia);
    }

    public void displayMultimedia() {
        System.out.println("------ LIST OF MULTIMEDIA-------");
        for (Multimedia multimedia : listOfMultimedia) {
            System.out.println(multimedia);
        }
    }
}
