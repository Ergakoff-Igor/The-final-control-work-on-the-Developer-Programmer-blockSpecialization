package Core.MVP;

import Core.Infrastructure.Commands;
import Core.Models.Animal;
import Core.Models.PackAnimal;
import Core.Models.Pet;

public class Presenter {

    private final Model model;
    private final View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }

    public void addAnimal() {
        System.out.println("Добавление животного:\n");
        String classNumber = view.setClass();
        System.out.print("\033[H\033[J");
        switch (classNumber) {
            case "1", "2", "3" -> {
                model.currentBook().add(
                        new Pet(view.getName(), view.getBirthday(),
                                new Commands().addCommand(view.getCommands())));
            }
            case "4", "5", "6" -> {
                model.currentBook().add(
                        new PackAnimal(view.getName(), view.getBirthday(),
                                new Commands().addCommand(view.getCommands())));
            }
            default -> System.out.println("Такх животных нет в питомнике");
        }
    }

    public void commandsToString() {

        for (int i = 0; i < model.currentBook().count(); i++) {
            if (model.currentBook().getAnimal(i).equals(model.currentAnimal())) {
                model.commandsAct.commandsToString(model.currentAnimal().getCommands());
                break;
            }
        }
    }

    public void addCommand() {

        for (int i = 0; i < model.currentBook().count(); i++) {
            if (model.currentBook().getAnimal(i).equals(model.currentAnimal())) {
                model.currentBook().getAnimal(i).getCommands().add(view.getCommands());
                break;
            }             
        }    
    }

    public int findAnimal() {
        System.out.println("Поиск контакта:\n");
        String name = view.getName();

        for (int i = 0; i < model.currentBook().count(); i++) {
            if (model.currentBook().getAnimal(i).getName().equals(name)) {
                this.outputAnimal(model.currentBook().getAnimal(i));
                break;
            }             
        }
        return model.getCurrentIndex();
    }

    public void remove() {
        for (int i = 0; i < model.currentBook().count(); i++) {
            if (model.currentBook().getAnimal(i).equals(model.currentAnimal())) {
                model.currentBook().remove(model.currentBook().getAnimal(i));
                break;
            }             
        }
    }

    public void saveToFile() {
        model.saveToCSV();
    }

    public void loadFromFile() {
        model.loadFromCSV();
    }

    public int next() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                this.outputAnimal(model.currentAnimal());
            } else {
                System.out.println("Вы просмотрели все контакты. Введите \"1\"");
            }
        }
        return model.getCurrentIndex();
    }

    public int prev() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                this.outputAnimal(model.currentAnimal());
            } else {
                System.out.println("Вы попали в начало списка. Введите \"2\"");
            }
        }
        return model.getCurrentIndex();
    }

    public void viewAll() {
        System.out.print("\033[H\033[J");
        for (Animal animal : model.currentBook().getAnimals()) {
            view.setAnimal(animal.getName(), animal.getBirthday(), model.commandsAct.commandsToString(animal.getCommands()));
        }
    }

    public int outputAnimal(Animal animal) {
        System.out.print("\033[H\033[J");
        System.out.printf("№: %d из: %d\n", model.getCurrentIndex() + 1, model.currentBook().count());
        view.setName(animal.getName());
        view.setBirthday(animal.getBirthday());
        view.setCommands(model.commandsAct.commandsToString(animal.getCommands()));
        return model.getCurrentIndex();
    }
}
