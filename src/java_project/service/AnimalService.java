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
                newAnimal = new Cat(name, birth_date, (ArrayList<String>) command, ++countMaxId);
                break;
            case 2:
                newAnimal = new Dog(name, birth_date, (ArrayList<String>)command, ++countMaxId);
                break;
            case 3:
                newAnimal = new Hamster(name, birth_date, (ArrayList<String>)command, ++countMaxId);
                break;

            case 4:
                newAnimal = new Horse(name, birth_date, (ArrayList<String>)command, ++countMaxId);
                break;

            case 5:
                newAnimal = new Donkey(name, birth_date, (ArrayList<String>)command, ++countMaxId);
                break;
            case 6:
                newAnimal = new Camel(name, birth_date, (ArrayList<String>)command, ++countMaxId);
//                newAnimal = new Camel(name, birth_date, command, ++countMaxId);
                break;
            default:
                System.out.println("Укажите корректный вид животного.");
                break;
        }
        if (newAnimal != null) {
            humanFriends.add(newAnimal);
            System.out.println("ОК! Добавлено новое животное " + name);
        }
    }

    @Override
    public String showCommand(String name) {
        StringBuilder sb = new StringBuilder();
        System.out.println(name);
        for (HumanFriends hF : humanFriends) {
            if (hF.getName().equalsIgnoreCase(name)) {
                sb.append("Команды животного:");
                for (String command : hF.getCommand()) {
                    sb.append(" ");
                    sb.append(command);
                }
            }
        }
        if (!sb.isEmpty())
            return sb.toString();
        else
            return "Животное не найдено.";

    }

    @Override
    public List<String> teachCommand(String name, String newCommand) {
        List<String> allCommands = new ArrayList<>();
        for (HumanFriends hF : humanFriends) {
            if (hF.getName().equalsIgnoreCase(name)) {
                hF.addCommand(newCommand);
            } allCommands.add(hF.getCommand().toString());
        }
        return allCommands.isEmpty() ? Collections.singletonList("Животное не найдено.") : allCommands;

    }

    @Override
    public void getAllByBirthDate() {
        Collections.sort(humanFriends, Comparator.comparing(HumanFriends::getBirth_date));
        System.out.println("Список животных по дате рождения:");
        for (HumanFriends hFriends : humanFriends) {
            System.out.println(hFriends);
        }
    }

    public int getAnimalsCount() {
        return humanFriends.size();
    }
}
