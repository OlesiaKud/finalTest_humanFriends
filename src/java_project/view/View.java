package java_project.view;

import java_project.controller.AnimalController;
import java_project.model.HumanFriends;
import java_project.service.AnimalService;

import java.util.List;
import java.util.Scanner;

public class View {
    public void printOnConsole (String str){
        System.out.println(str);
    }
    public void getView() {
        AnimalController ac = new AnimalController();
        System.out.println("Меню: \n 1 - добавить новое животное; \n 2 - список команд, которые выполняет 1 животное; \n 3 - обучение новым командам; \n 4 - список животных по дате рождения; \n 5 - количество животных \n 0 - выход.\n");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                ac.createNewAnimal();
                getView();
                break;
            case 2:
                ac.showCommand();
                getView();
                break;
            case 3:
                ac.teachCommand();
                getView();
                break;
            case 4:
                ac.getAllByBirthDate();
                getView();
                break;
            case 5:
                ac.getAnimalsCount();
                getView();
            case 0:
                break;
            default:
                getView();
        }
    }
    public Integer getTypeAnimal(){
        System.out.println("Создание нового животного.");
        System.out.println("Выберите тип животного: \n 1 - кошка,\n 2 - собака,\n 3 - хомяк,\n 4 - лошадь,\n 5 - осёл,\n 6 - верблюд. ");
        Scanner sc = new Scanner(System.in);
        Integer res = sc.nextInt();
        return res;
    }
    public String getName() {
        System.out.println("Введите имя животного:");
        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        return res;
    }
    public String getBirthDate(){
        System.out.println("Введите дату рождения животного в формате ГГГГ-ММ-ДД");
        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        return res;
    }
    public String teachCommand() {
        System.out.println("Введите команду:");
        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        return res;

    }



}
