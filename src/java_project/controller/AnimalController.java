package java_project.controller;

import java_project.model.HumanFriends;
import java_project.service.AnimalService;
import java_project.view.View;

import java.util.ArrayList;
import java.util.List;

public class AnimalController implements Controller<HumanFriends> {
    private final AnimalService as = new AnimalService();
    private final View view = new View();


    @Override
    public void createNewAnimal() {
        int choice = view.getTypeAnimal();
        String name = view.getName();
        String birth_date = view.getBirthDate();
        String command1 = view.teachCommand();
        String command2 = view.teachCommand();
        List<String> command = new ArrayList<>();
        command.add(command1);
        command.add(command2);
        as.createNewAnimal(choice, name, birth_date, command);
    }

    @Override
    public void showCommand() {
        System.out.println("Команды животного.");
        String name = view.getName();
        System.out.println(name);
        String showCommands = as.showCommand(name);
        view.printOnConsole(showCommands);
    }

    @Override
    public void teachCommand() {
        String name = view.getName();
        String newCommand = view.teachCommand();
        as.teachCommand(name, newCommand);
    }

    @Override
    public void getAllByBirthDate() {

        as.getAllByBirthDate();

    }

    @Override
    public void getAnimalsCount() {
        as.getAnimalsCount();
        String res = String.valueOf(as.getAnimalsCount());
        view.printOnConsole(res);

    }


}
