package Core.MVP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Core.Infrastructure.AnimalLog;
import Core.Models.Animal;
import Core.Models.PackAnimal;
import Core.Infrastructure.Commands;
import Core.Models.Pet;

public class Model {

    AnimalLog currentBook;
    Animal animal;
    Commands commandsAct;
    private int currentIndex;
    private String path;

    public Model(String path) {
        currentBook = new AnimalLog();
        commandsAct = new Commands();
        currentIndex = 0;
        this.path = path;
    }

    public Animal currentAnimal() {
        if (currentIndex >= 0) {
            return currentBook.getAnimal(currentIndex);
        } else {
            return null;
        }
    }

    public void loadFromCSV() {
        try (Scanner scanner = new Scanner(new File(path));) {
            while (scanner.hasNextLine()) {
                currentBook.add(getRecordFromLine(scanner.nextLine()));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Animal getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(", ");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
            rowScanner.close();
            switch (values.get(0)) {
                case "class Core.Models.Pet" -> {
                    animal = new Pet(values.get(1), values.get(2), commandsAct.addCommand(values.get(3)));
                }
                case "class Core.Models.PackAnimal" -> {
                    animal = new PackAnimal(values.get(1), values.get(2), commandsAct.addCommand(values.get(3)));
                }
                default -> System.out.println("Такх животных нет в питомнике");
            }
        }
        return animal;
    }

    public void saveToCSV() {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Animal animal = currentBook.getAnimal(i);
                writer.append(String.format("%s, ", animal.getClass()));
                writer.append(String.format("%s, ", animal.getName()));
                writer.append(String.format("%s, ", animal.getBirthday()));
                writer.append(String.format("%s\n", commandsAct.commandsToString(animal.getCommands())));
                // writer.append(String.format("%s\n", contact.phones));
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public AnimalLog currentBook() {
        return this.currentBook;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }



}