package java_project.service;

import java_project.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class AnimalService implements Service {
    private final List<HumanFriends> humanFriends;

    public AnimalService() {
        this.humanFriends = new ArrayList<>();
    }

    @Override
    public List<HumanFriends> getAll() {
        return humanFriends;
    }

    @Override
    public void createNewAnimal(Integer choice, String name, String birth_date, List command) {
        int countMaxId = 0;
        for (HumanFriends humanFriend : humanFriends) {
            if (humanFriend.getAnimalId() > countMaxId) {
                countMaxId = humanFriend.getAnimalId();
            }
        }
        HumanFriends newAnimal = null;
        switch (choice) {
            case 1:
                newAnimal = new Cat(name, birth_date, command, ++countMaxId);
                break;
            case 2:
                newAnimal = new Dog(name, birth_date, command, ++countMaxId);
                break;
            case 3:
                newAnimal = new Hamster(name, birth_date, command, ++countMaxId);
                break;

            case 4:
                newAnimal = new Horse(name, birth_date, command, ++countMaxId);
                break;

            case 5:
                newAnimal = new Donkey(name, birth_date, command, ++countMaxId);
                break;
            case 6:
                newAnimal = new Camel(name, birth_date, command, ++countMaxId);
                break;
            default:
                System.out.println("Укажите корректный вид животного.");
        }
        if (newAnimal != null) {
            humanFriends.add(newAnimal);
            System.out.println("ОК! Животное добавлено");
        }
    }

    @Override
    public void showCommand(String name) {
        for (HumanFriends humanFriend : humanFriends) {
            if (humanFriend.getName().equalsIgnoreCase(name)) {
                System.out.println("Команды, которые выполняет " + name + ":");
                for (String command : humanFriend.getCommand()) {
                    System.out.println(command);
                }
//            } else {
//                System.out.println("Животное не найдено.");
            }
        }
    }

    @Override
    public List<String> teachCommand(String name, String newCommand) {
        List<String> allCommands = new ArrayList<>();
        for (HumanFriends humanFriend : humanFriends) {
            if (humanFriend.getName().equalsIgnoreCase(name)) {

//                allCommands.add(newCommand);
                humanFriend.addCommand(newCommand);
                allCommands.add(humanFriend.getCommand().toString());
            }
//            else {
//                System.out.println("Животное не найдено.");
//            }
        }
        return allCommands;
    }

    @Override
    public void getAllByBirthDate() {
        Collections.sort(humanFriends, Comparator.comparing(HumanFriends::getBirth_date));

        System.out.println("Список животных по дате рождения:");
        for (HumanFriends h_Friends : humanFriends) {
            System.out.println(humanFriends);
        }
    }

    public int getAnimalsCount() {
        return humanFriends.size();
    }
}
