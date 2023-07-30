package Core.Infrastructure;

import java.util.ArrayList;
import java.util.List;

import Core.Models.Animal;

public class AnimalLog {

    private final List<Animal> animals;
    
    public AnimalLog() {
        animals = new ArrayList<Animal>();
    }

    // Добавление животного
    public boolean add(Animal animal) {
        boolean flag = false;
        if (!animals.contains(animal)) {
            animals.add(animal);
            flag = true;
        }
        return flag;
    }

    // Вывод животного
    public Animal getAnimal(int index) {
        return contains(index) ? animals.get(index) : null;
    }

    // Удаление животного
    public boolean remove(Animal animal) {
        boolean flag = false;
        if (animals.indexOf(animal) != -1) {
            animals.remove(animal);
            flag = true;
        }
        return flag;
    }

    public boolean contains (int index) {
        return animals != null
                && animals.size() > index;
    }

    public List<Animal> getAnimals() {
        return this.animals;
    }

    public int count() {
        return animals.size();
    }
}
